// src/services/apiService.js
import axios from 'axios';

const API_BASE_URL = 'http://localhost:8080/api';

export const productService = {
    getAllProducts: () => axios.get(`${API_BASE_URL}/products`),
    getProduct: (id) => axios.get(`${API_BASE_URL}/products/${id}`),
    createProduct: (product) => axios.post(`${API_BASE_URL}/products`, product),
    updateProduct: (id, product) => axios.put(`${API_BASE_URL}/products/${id}`, product),
    deleteProduct: (id) => axios.delete(`${API_BASE_URL}/products/${id}`)
};