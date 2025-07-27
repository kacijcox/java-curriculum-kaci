import React, { useState } from 'react';
import './App.css';

const API_BASE = 'http://localhost:8080';

function App() {
  const [items, setItems] = useState([]);
  const [servers, setServers] = useState([]);
  const [orders, setOrders] = useState([]);

  const handleGetItems = async () => {
    const response = await fetch(`${API_BASE}/item`);
    const data = await response.json();
    setItems(data);
  };

  const handleGetServers = async () => {
    const response = await fetch(`${API_BASE}/server`);
    const data = await response.json();
    setServers(data);
  };

  const handleGetOrders = async () => {
    const response = await fetch(`${API_BASE}/order`);
    const data = await response.json();
    setOrders(data);
  };

  return (
    <div className = "App">
      <h1 className = "title">bistro</h1>
      <div className = "items">
        <h2 className = "items-title">items</h2>
        <button className = "item-button" onClick={handleGetItems}>get items</button>
        <div><pre>{JSON.stringify(items)}</pre></div>
      </div>

      <div className = "servers">
        <h2 className = "server-title">servers</h2>
        <button className = "server-button" onClick={handleGetServers}>get servers</button>
        <div><pre>{JSON.stringify(servers)}</pre></div>
      </div>

      <div className = "orders">
        <h2 className = "order-title" >orders</h2>
        <button className = "order-button" onClick={handleGetOrders}>get orders</button>
        <div><pre>{JSON.stringify(orders)}</pre></div>
      </div>
    </div>
  );
}

export default App;