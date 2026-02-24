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
    <li><strong>Features:</strong> Full access to the Admin Dashboard (Create, Read, Update, Delete). Can fully check all employee records and print payslips for any employee, including themselves.</li>
</ul>

<h4>2. Regular Employee</h4>
<ul>
    <li><strong>Username:</strong> [Employee ID] (e.g., 10001)</li>
    <li><strong>Password:</strong> [Last Name] (e.g., Garcia)</li>
    <li><strong>Features:</strong> Access to personal information and the ability to print their own individual payslips.</li>
</ul>

<h3>Key Features & Updates</h3>
<ul>
    <li><strong>Management Dashboard:</strong> A JTable view displaying Employee Number, Last Name, First Name, SSS, PhilHealth, TIN, and Pag-IBIG numbers.</li>
    <li><strong>Employee Viewer:</strong> Admins can now fully view comprehensive employee records and detailed profiles.</li>
    <li><strong>Payroll Processing:</strong> Select a specific month to compute salary; displays employee details and computed pay in a single view.</li>
    <li><strong>Printing System (Updated):</strong> The issue regarding payslip printing with calculations has been resolved. Both Admins and Employees can now successfully print accurate payslips.</li>
    <li><strong>Real-time Updates:</strong> New employee data is appended to the CSV file, and the table refreshes automatically.</li>
</ul>

<h3>Development Tracking</h3>
<ul>
    <li><strong>Sunny Eljohn Lico:</strong> 
        <ul>
            <li>Reworked the Login feature to support Role-Based access control and Dashboards.</li>
            <li>Fixed and updated the <strong>Payslip Printing feature</strong> with accurate calculations.</li>
            <li>Enhanced Admin capabilities to allow full record viewing and multi-employee payslip printing.</li>
            <li>Currently working on transitioning the entire codebase to <strong>OOP Principles</strong>.</li>
        </ul>
    </li>
</ul>

<h3>How to Run</h3>
<ul>
    <li>Open the project in a Java IDE.</li>
    <li>Ensure the CSV data file is in the correct directory.</li>
    <li>Run the application and use the credentials listed in the System Access section.</li>
</ul>
<ul>
    <li>Open the project in a Java IDE.</li>
    <li>Ensure the CSV data file is in the correct directory.</li>
    <li>Run the application and use the credentials listed in the System Access section.</li>
</ul>
