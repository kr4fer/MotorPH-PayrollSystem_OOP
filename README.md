<h1>MotorPH Payroll System</h1>

<h3>Project Overview</h3>
<ul>
    <li><strong>Purpose:</strong> A Java-based payroll system for MotorPH to streamline employee management and automate salary computations.</li>
    <li><strong>Tech Stack:</strong> Built using <strong>Java Swing</strong> for the GUI and <strong>CSV/Text files</strong> for data storage (managed via OpenCSV).</li>
    <li><strong>Core Functions:</strong> Automated calculations for SSS, PhilHealth, Pag-IBIG, and Withholding Tax.</li>
    <li><strong>Development Note:</strong> This system has transitioned from procedural logic to a full <strong>Object-Oriented Programming (OOP)</strong> architecture. This shift ensures data consistency, reduced errors, and easier maintenance.</li>
</ul>

<h3>System Access & User Credentials</h3>
<p>The system utilizes a <code>FileHandler</code> to authenticate users and direct them to specific dashboards:</p>

<h4>1. Administrator</h4>
<ul>
    <li><strong>Username:</strong> admin</li>
    <li><strong>Password:</strong> 1234</li>
    <li><strong>Features:</strong> Full access to the Admin Dashboard (CRUD). Can check all employee records and print payslips for any employee.</li>
</ul>

<h4>2. Regular Employee</h4>
<ul>
    <li><strong>Username:</strong> [Employee ID] (e.g., 10001)</li>
    <li><strong>Password:</strong> [Last Name] (e.g., Garcia)</li>
    <li><strong>Features:</strong> Access to personal information and the ability to view/print their individual payslips.</li>
</ul>

<h3>Core OOP Principles Implementation</h3>
<p>The system is built on four core OOP pillars to ensure code quality and maintainability:</p>



<table border="1" style="width:100%; border-collapse: collapse; text-align: left;">
    <tr style="background-color: #f2f2f2;">
        <th>Principle</th>
        <th>What we did in the code</th>
        <th>Where to see it</th>
    </tr>
    <tr>
        <td><strong>Encapsulation</strong></td>
        <td>We hid raw benefit data inside the <code>Benefits</code> class. Fields are private, and access is managed via "Getters" like <code>getRiceSubsidy()</code>.</td>
        <td>Benefits.java & Employee.java</td>
    </tr>
    <tr>
        <td><strong>Composition</strong></td>
        <td>Established a <strong>"Has-A"</strong> relationship. The <code>Employee</code> class no longer just has a number; it now has a <code>Benefits</code> object.</td>
        <td>Employee.java (protected Benefits field)</td>
    </tr>
    <tr>
        <td><strong>Inheritance</strong></td>
        <td><code>RegularEmployee</code> inherits from <code>Employee</code>, reusing all identity and salary fields while focusing only on its specific pay logic.</td>
        <td>RegularEmployee.java</td>
    </tr>
    <tr>
        <td><strong>Abstraction</strong></td>
        <td>In <code>PayrollLogic</code>, we simplified complex math. The GUI just calls <code>calculateGrossWeeklySalary(emp, hoursWorked)</code> without needing to know internal tax formulas.</td>
        <td>PayrollLogic.java</td>
    </tr>
</table>

<h3>Why We Implemented OOP (Use & Relevance)</h3>
<ul>
    <li><strong>Organized Data:</strong> Instead of passing 5 or 6 separate double variables (rice, phone, clothing, etc.) between classes, we bundled them into one <code>Benefits</code> object.</li>
    <li><strong>Easier Maintenance:</strong> If MotorPH adds a new "Laundry Allowance," you only update the <code>Benefits</code> class. You don't have to rewrite methods in your logic or GUI files.</li>
    <li><strong>Reduced Errors:</strong> By using objects, we fixed "signature mismatches" where a method was expecting 5 numbers but only received 3.</li>
    <li><strong>Code Reusability:</strong> The <code>Benefits</code> object created in <code>FileHandler</code> is the same one used for both the Salary Report and the Payslip, ensuring consistency.</li>
</ul>

<h3>Core Component Implementation</h3>
<ul>
    <li><strong>Employee.java (Composition):</strong> The <code>Employee</code> class includes a <code>Benefits</code> object. The constructor initializes this object, storing it for use by subclasses.</li>
    <li><strong>FileHandler.java (Object Creation):</strong> This is where CSV data is "transformed" into an Object. It reads the columns, creates a <code>new Benefits(...)</code>, and returns a <code>new RegularEmployee(...)</code>.</li>
    <li><strong>PayrollLogic.java (Object Collaboration):</strong> This class takes an <code>Employee</code> object as input and "collaborates" with it to extract the specific salary and benefit data needed for calculations.</li>
</ul>

<h3>Project Class Hierarchy (UML Overview)</h3>

<p>The diagram below illustrates the relationships and architectural flow between the core components of the system:</p>

<div style="background-color: #f9f9f9; padding: 20px; border-left: 5px solid #2980b9; font-family: 'Courier New', Courier, monospace; overflow-x: auto;">
    <pre>
<strong>«Interface»</strong>
   <strong>IPayable</strong>
 (calculateGrossPay)
         ^
         | <i>(Implements)</i>
         |
<strong>«Abstract»</strong>
   <strong>Employee</strong>  <--->  <strong>Benefits</strong> (Composition: Employee <strong>HAS-A</strong> Benefits)
 (Protected fields)    (Private rice, phone, clothing)
         ^
         | <i>(Inherits)</i>
         |
<strong>RegularEmployee</strong> 
(@Override calculateGrossPay)
    </pre>
</div>

<h3>Development Tracking</h3>
<ul>
    <li><strong>Sunny Eljohn Lico:</strong>
        <ul>
            <li>Reworked the Login system and Dashboard redirection for specific user types.</li>
            <li>Resolved calculation bugs and updated the <strong>Payslip Printing feature</strong>.</li>
            <li><strong>Lead Architect:</strong> Successfully transitioned the procedural codebase into a structured OOP/MVC architecture, prioritizing Abstraction, Encapsulation, and Composition.</li>
        </ul>
    </li>
</ul>

<h3>How to Run</h3>
<ul>
    <li>Open the project in a Java IDE (e.g., NetBeans, IntelliJ, or Eclipse).</li>
    <li>Ensure <code>employee.txt</code> and <code>attendance.txt</code> are located in the <code>data</code> folder.</li>
    <li>Run the application and use the credentials provided in the <strong>System Access</strong> section.</li>
</ul>

