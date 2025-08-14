const authService = {
    register: async (username, password) => {
        const response = await fetch('http://localhost:8080/api/auth/register', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ username, password })
        });
        return response.text();
    },

    login: async (username, password) => {
        const response = await fetch('http://localhost:8080/api/auth/login', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ username, password })
        });

        if (response.ok) {
            const data = await response.json();
            localStorage.setItem('token', data.token);
            localStorage.setItem('username', data.username);
            return data;
        }
        throw new Error('Login failed');
    },

    logout: () => {
        localStorage.removeItem('token');
        localStorage.removeItem('username');
    },

    isLoggedIn: () => !!localStorage.getItem('token')
};

export default authService;