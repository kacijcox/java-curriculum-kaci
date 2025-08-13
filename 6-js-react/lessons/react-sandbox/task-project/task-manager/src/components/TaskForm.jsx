import React, { useState } from "react";

export default function TaskForm() {
    const [title, setTitle] = useState('')
    const [description, setDescription] = useState('')
    const [impact, setImpact] = useState("1")
    const [effort, setEffort] = useState("1")

    const impactLabels = {1: "low", 2: "high"};
    const effortLabels = {1: "low", 2: "high"};

    const clearForm = () => {
        setTitle("");
        setDescription("");
        setImpact("1");
        setEffort("1");
    }

    const handleSubmit = (e) => {
        e.preventDefault();

        let priority = 0;

        if (impact === "2" && effort === "1") {
            priority = 1;
        }

        if (impact === "2" && effort === "2") {
            priority = 2;
        }

        if (impact === "1" && effort === "1") {
            priority = 3;
        }

        if (impact === "1" && effort === "2") {
            priority = 4;
        }

        const taskData = {
            id: crypto.randomUUID(),
            date: new Date().toISOString().slice(0,23),
            title,
            description,
            priority,
        }

        console.log(taskData);

        fetch("http://localhost:8080/tasks", {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(taskData),
        })
            .then((response) => response.json())
            .then((data) => console.log(data))


        clearForm()
    }



    return (
        <div className="task-form">
            <div>
                <label>title</label>
                <input value={title} type="text" onChange={e => setTitle(e.target.value)} />
            </div>

            <div>
                <label>description</label>
                <textarea value={description} onChange={(e) => setDescription(e.target.value)} />
            </div>

            <div className="priority-container">
                <fieldset className="priority-fieldset">
                    <legend>impact</legend>
                    {Object.entries(impactLabels).map(([key, value]) => (
                        <label key={value} className="priority-label">
                            <input
                                type="radio"
                                value={key}
                                checked={impact === key}
                                onChange={() => setImpact(key)}
                            />
                            {value}
                        </label>
                    ))}
                </fieldset>
                <fieldset className="priority-fieldset">
                    <legend>effort</legend>
                    {Object.entries(effortLabels).map(([key, value]) => (
                        <label key={value} className="priority-label">
                            <input
                                type="radio"
                                value={key}
                                checked={effort === key}
                                onChange={() => setEffort(key)}
                            />
                            {value}
                        </label>
                    ))}
                </fieldset>
            </div>
            <button onClick={handleSubmit}>add task</button>
        </div>
    )
}