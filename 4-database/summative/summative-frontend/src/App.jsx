import React, { useState } from 'react';
import "bootstrap/dist/css/bootstrap.min.css";
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
  <div className="App">
    <div className="card-row">
      <div className="card">
        <h2 className="title">items</h2>
        <button className="button" onClick={handleGetItems}>get items</button>
        <pre>{JSON.stringify(items, null, 2)}</pre>
      </div>

      <div className="card">
        <h2 className="title">servers</h2>
        <button className="button" onClick={handleGetServers}>get servers</button>
        <pre>{JSON.stringify(servers, null, 2)}</pre>
      </div>

      <div className="card">
        <h2 className="title">orders</h2>
        <button className="button" onClick={handleGetOrders}>get orders</button>
        <pre>{JSON.stringify(orders, null, 2)}</pre>
      </div>
    </div>
  </div>
);


}

export default App;