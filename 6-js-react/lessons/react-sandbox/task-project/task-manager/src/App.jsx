import React, { useEffect, useState, useReducer} from 'react';
import './App.css';
import TaskForm from './components/TaskForm.jsx';

function App() {

    return (
        <>
            <div className="container"></div>
            <TaskForm />
        </>
    )
}

export default App
