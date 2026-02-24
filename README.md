<h1>MotorPH Payroll System</h1>

<h3>Project Overview</h3>
<ul>
    <li><strong>Purpose:</strong> A Java-based payroll system for MotorPH to streamline employee management and automate salary computations.</li>
    <li><strong>Tech Stack:</strong> Built using <strong>Java Swing</strong> for the GUI and <strong>CSV/Text files</strong> for data storage.</li>
    <li><strong>Core Functions:</strong> Automated calculations for SSS, PhilHealth, Pag-IBIG, and Withholding Tax.</li>
    <li><strong>Development Note:</strong> This system has been successfully transitioned from procedural logic to a full <strong>Object-Oriented Programming (OOP)</strong> architecture, with a primary focus on <strong>Abstraction</strong> and <strong>Encapsulation</strong>.</li>
</ul>

<h3>System Access & User Credentials</h3>
<p>The system utilizes a login mechanism to direct specific users to their respective dashboards:</p>

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
    <li><strong>Features:</strong> Access to personal information and the ability to view/print their individual payslips.</li>
</ul>

<h3>Key Features & Updates</h3>
<ul>
    <li><strong>Management Dashboard:</strong> A JTable view displaying Employee Number, Last Name, First Name, SSS, PhilHealth, TIN, and Pag-IBIG numbers.</li>
    <li><strong>Full Employee Records:</strong> Admins can now fully check comprehensive employee data and detailed professional profiles.</li>
    <li><strong>Payroll Processing:</strong> Monthly salary computation engine that displays employee details and computed net pay in a single view.</li>
    <li><strong>Updated Printing System:</strong> Fixed and updated the payslip printing feature; calculations are now fully integrated and accurate for all users.</li>
    <li><strong>Real-time CSV Integration:</strong> Data is read from and appended to CSV files, ensuring the dashboard refreshes automatically upon submission.</li>
</ul>

<h3>Core OOP Principles Applied</h3>


<ul>
    <li><strong>Encapsulation (Primary Focus):</strong> Used in <code>Benefits.java</code>, <code>Employee.java</code>, and <code>Deductions.java</code>.
        <ul>
            <li><strong>Data Integrity:</strong> All sensitive data fields are marked <code>private</code> to prevent unauthorized modification.</li>
            <li><strong>Controlled Access:</strong> Public getters and setters act as gates, including validation logic (e.g., preventing negative salary inputs) to maintain system stability.</li>
        </ul>
    </li>
</ul>


<ul>
    <li><strong>Abstraction (Primary Focus):</strong> Implemented via <code>IPayable.java</code> (interface) and <code>Employee.java</code> (abstract class).
        <ul>
            <li><strong>Blueprinting:</strong> Defines "what" the payroll system does (e.g., <code>calculateGrossPay()</code>) without cluttering the main logic with "how" it does it.</li>
            <li><strong>Reduced Complexity:</strong> Complex government deduction matrices are hidden behind simple method calls, making the code easier to maintain.</li>
        </ul>
    </li>
    <li><strong>Inheritance:</strong> <code>RegularEmployee.java</code> extends the <code>Employee</code> class, utilizing <code>super()</code> to reuse code for identity and salary fields.</li>
    <li><strong>Polymorphism:</strong> Method overriding and dynamic binding in <code>PayrollLogic.java</code> allows the system to process different employee types flexibly at runtime.</li>
</ul>

<h3>OOP Implementation Summary</h3>
<table border="1" style="width:100%; border-collapse: collapse; text-align: left;">
    <tr style="background-color: #f2f2f2;">
        <th>OOP Principle</th>
        <th>File(s) Involved</th>
        <th>Specific Implementation</th>
    </tr>
    <tr>
        <td><strong>Encapsulation</strong></td>
        <td>Benefits.java, Employee.java, Deductions.java</td>
        <td>Private fields, public getters/setters, and internal validation logic.</td>
    </tr>
    <tr>
        <td><strong>Abstraction</strong></td>
        <td>IPayable.java, Employee.java</td>
        <td>Use of <code>interface</code> and <code>abstract</code> methods to define payroll contracts.</td>
    </tr>
    <tr>
        <td><strong>Inheritance</strong></td>
        <td>RegularEmployee.java</td>
        <td>Reuse of parent constructor and attributes via <code>extends</code>.</td>
    </tr>
    <tr>
        <td><strong>Polymorphism</strong></td>
        <td>PayrollLogic.java</td>
        <td>Dynamic binding to process generic <code>Employee</code> objects.</td>
    </tr>
</table>

<h3>Development Tracking</h3>
<ul>
    <li><strong>Sunny Eljohn Lico:</strong>
        <ul>
            <li>Reworked the Login system and Dashboard redirection for specific users.</li>
            <li>Resolved calculation bugs and updated the <strong>Payslip Printing feature</strong>.</li>
            <li><strong>Lead Architect:</strong> Successfully transitioned the procedural codebase into an <strong>OOP architecture</strong>, specifically prioritizing <strong>Abstraction</strong> and <strong>Encapsulation</strong> for security and scalability.</li>
            <li>Enabled full employee record checking for the Admin dashboard.</li>
        </ul>
    </li>
</ul>

<h3>How to Run</h3>
<ul>
    <li>Open the project in a Java IDE (e.g., NetBeans, IntelliJ, or Eclipse).</li>
    <li>Ensure the <code>.csv</code> data file is located in the root project directory.</li>
    <li>Run the application and use the credentials provided in the <strong>System Access</strong> section.</li>
</ul>
