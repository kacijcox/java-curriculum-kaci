import React, { useState, useEffect } from 'react';
import ProductRow from './ProductRow';
import { productService } from '../services/apiService';

function ProductList() {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    productService.getAllProducts()
      .then(res => setProducts(res.data))
      .catch(err => console.error('Error loading products:', err));
  }, []);

  const handleDelete = async (id) => {
    try {
      await productService.deleteProduct(id);
      setProducts(prev => prev.filter(p => p.productID !== id));
    } catch (err) {
      console.error('Delete failed:', err);
    }
  };

  return (
    <div className="container main-content">
      <h2>Product Inventory</h2>
      {products.length === 0
        ? <p>No products available.</p>
        : products.map(product => (
            <ProductRow
              key={product.productID}
              product={product}
              onDelete={() => handleDelete(product.productID)}
            />
          ))
      }
    </div>
  );
}

export default ProductList;
