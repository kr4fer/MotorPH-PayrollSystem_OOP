<h1>MotorPH Payroll System (MPHC02)</h1>

<h3>Project Overview</h3>
<ul>
    <li><strong>Purpose:</strong> A Java-based payroll system for MotorPH to streamline employee management and automate salary computations.</li>
    <li><strong>Tech Stack:</strong> Built using <strong>Java Swing</strong> for the GUI and <strong>CSV/Text files</strong> for data storage.</li>
    <li><strong>Core Functions:</strong> Automated calculations for SSS, PhilHealth, Pag-IBIG, and Withholding Tax.</li>
    <li><strong>Development Note:</strong> This specific branch is implemented using functional/procedural logic and <strong>does not follow OOP principles</strong>.</li>
</ul>

<h3>System Access & Control</h3>
<p>The system features <strong>Role-Based Access Control</strong> to ensure data security:</p>

<h4>1. Administrator</h4>
<ul>
    <li><strong>Username:</strong> admin</li>
    <li><strong>Password:</strong> 1234</li>
    <li><strong>Features:</strong> Full access to the Admin Dashboard (Create, Read, Update, Delete) and the ability to <strong>print payslips</strong> for specific employees.</li>
</ul>

<h4>2. Regular Employee</h4>
<ul>
    <li><strong>Username:</strong> [Employee ID] (e.g., 10001)</li>
    <li><strong>Password:</strong> [Last Name] (e.g., Garcia)</li>
    <li><strong>Features:</strong> Access to personal information and the new feature to <strong>print individual payslips</strong>.</li>
</ul>

<h3>Key Features</h3>
<ul>
    <li><strong>Management Dashboard:</strong> A JTable view displaying essential fields: Employee Number, Last Name, First Name, SSS, PhilHealth, TIN, and Pag-IBIG numbers.</li>
    <li><strong>Employee Viewer:</strong> Select an employee from the table to view their full professional profile in a new frame.</li>
    <li><strong>Payroll Processing:</strong> Select a specific month to compute salary; the system displays both employee details and the final computed pay in one view.</li>
    <li><strong>Printing System:</strong> Integrated functionality for both Admins and Regular Employees to generate/print payslip documents.</li>
    <li><strong>Real-time Updates:</strong> New employee data is appended to the CSV file, and the table refreshes automatically.</li>
</ul>

<h3>Development Team</h3>
<ul>
    <li><strong>Rhynne Gracelle Pontanilla:</strong> Developed the JTable employee display and the "View Employee" detail frame.</li>
    <li><strong>Carl Justine Pontanilla:</strong> Created the "New Employee" entry form and interface.</li>
    <li><strong>Ghaby Gonzales:</strong> Implemented CSV data appending logic and modified the AddEmployee and Employee panels.</li>
    <li><strong>Conrado Santos:</strong> Engineered the File Handler (Read/Write) and the Salary Computation engine with month selection.</li>
    <li><strong>Sunny Eljohn Lico:</strong> Reworked the Login feature to support Role-Based access, implemented the <strong>Payslip Printing feature</strong>, and is currently transitioning the codebase to <strong>OOP Principles</strong> and enhancing the Admin's full information view.</li>
</ul>

<h3>How to Run</h3>
<ul>
    <li>Open the project in a Java IDE.</li>
    <li>Ensure the CSV data file is in the correct directory.</li>
    <li>Run the application and use the credentials listed in the System Access section.</li>
</ul>
