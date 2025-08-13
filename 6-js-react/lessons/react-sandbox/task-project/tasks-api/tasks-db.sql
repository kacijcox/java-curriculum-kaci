drop database if exists tasks;
create database tasks;
use tasks;

create table task (
	id char(36) primary key,
	date timestamp not null,
    title varchar(128) not null,
    description varchar(1024) not null,    
	priority int not null
);

INSERT INTO task (id, date, title, description, priority) VALUES
(UUID(), '2025-08-01 10:15:00', 'Initialize React App', 'Use Create React App to scaffold the project structure.', 1),
(UUID(), '2025-08-01 11:00:00', 'Set Up Routing', 'Implement React Router for navigation between pages.', 2),
(UUID(), '2025-08-01 13:30:00', 'Create Header Component', 'Design and code a reusable header with navigation links.', 3),
(UUID(), '2025-08-02 09:45:00', 'Build Footer Component', 'Add a footer with contact info and social media links.', 3),
(UUID(), '2025-08-02 14:20:00', 'Create Home Page', 'Design the landing page with introductory content.', 2),
(UUID(), '2025-08-03 10:00:00', 'Develop About Page', 'Include team bios and project mission statement.', 2),
(UUID(), '2025-08-03 15:10:00', 'Create Contact Form', 'Build a form with validation for user inquiries.', 1),
(UUID(), '2025-08-04 09:30:00', 'Implement State Management', 'Use Context API for global state handling.', 1),
(UUID(), '2025-08-04 12:45:00', 'Add Loading Indicators', 'Show spinners or skeletons during data fetches.', 4),
(UUID(), '2025-08-05 11:15:00', 'Connect to API', 'Fetch data from backend endpoints and display it.', 1),
(UUID(), '2025-08-05 16:00:00', 'Add Error Handling', 'Gracefully handle failed API calls and show messages.', 2),
(UUID(), '2025-08-06 10:30:00', 'Style Components', 'Use CSS modules or styled-components for styling.', 2),
(UUID(), '2025-08-06 13:00:00', 'Add Animations', 'Add CSS transitions for UI effects.', 4),
(UUID(), '2025-08-07 09:00:00', 'Write Unit Tests', 'Use Jest and React Testing Library to test components.', 1),
(UUID(), '2025-08-07 14:30:00', 'Deploy to Netlify', 'Configure deployment settings and push to production.', 1);

