<h1>MotorPH Payroll System (MPHC02)</h1>

<h3>Project Overview</h3>
<ul>
    <li><strong>Purpose:</strong> A Java-based payroll system for MotorPH to streamline employee management and automate salary computations.</li>
    <li><strong>Tech Stack:</strong> Built using <strong>Java Swing</strong> for the GUI and <strong>CSV/Text files</strong> for data storage.</li>
    <li><strong>Core Functions:</strong> Automated calculations for SSS, PhilHealth, Pag-IBIG, and Withholding Tax.</li>
    <li><strong>Development Note:</strong> This version of the system has been updated to follow <strong>Object-Oriented Programming (OOP) Principles</strong>.</li>
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
    <li><strong>Printing System:</strong> The issue regarding payslip printing with calculations has been resolved. Both Admins and Employees can now successfully print accurate payslips.</li>
    <li><strong>Real-time Updates:</strong> New employee data is appended to the CSV file, and the table refreshes automatically.</li>
</ul>

<h3>OOP Implementation Details</h3>

<h4>1. Encapsulation (Data Security & Integrity)</h4>
<ul>
    <li><strong>Private Fields:</strong> In <code>Benefits.java</code> and <code>Attendance.java</code>, data fields are marked as private to prevent unauthorized tampering.</li>
    <li><strong>Getters/Setters:</strong> Access to private fields is controlled via public methods (e.g., <code>getRiceSubsidy()</code>).</li>
    <li><strong>Validation Logic:</strong> The <code>setBasicSalary</code> method in <code>Employee.java</code> ensures values cannot be negative.</li>
    <li><strong>Implementation Hiding:</strong> In <code>Deductions.java</code>, complex tax formulas are kept internal; the system only calls <code>getTotalDeductions()</code>.</li>
</ul>

<h4>2. Abstraction (The Blueprinting)</h4>
<ul>
    <li><strong>Interfaces:</strong> <code>IPayable.java</code> defines the contract that any payable entity must have a <code>calculateGrossPay()</code> method.</li>
    <li><strong>Abstract Classes:</strong> <code>Employee.java</code> is an abstract class that cannot be instantiated on its own.</li>
    <li><strong>Abstract Methods:</strong> <code>calculateGrossPay()</code> is abstract, forcing subclasses to provide their own math logic.</li>
</ul>

<h4>3. Inheritance (Code Reusability)</h4>
<ul>
    <li><strong>Subclassing:</strong> <code>RegularEmployee.java</code> extends the <code>Employee</code> class to inherit properties like ID and Name.</li>
    <li><strong>Constructor Reuse:</strong> Uses <code>super()</code> to initialize identity fields consistently in the parent class.</li>
</ul>

<h4>4. Polymorphism (Flexibility)</h4>
<ul>
    <li><strong>Method Overriding:</strong> <code>RegularEmployee</code> overrides <code>calculateGrossPay()</code> for specific salaried staff math.</li>
    <li><strong>Dynamic Binding:</strong> <code>PayrollLogic.java</code> uses <code>processNetPay(Employee emp)</code> to handle any employee type at runtime.</li>
</ul>



<h3>OOP Summary Table</h3>
<table border="1" style="width:100%; border-collapse: collapse;">
    <thead>
        <tr style="background-color: #f2f2f2;">
            <th>OOP Principle</th>
            <th>Found in File(s)</th>
            <th>Specific Implementation</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><strong>Encapsulation</strong></td>
            <td>Benefits.java, Employee.java, Deductions.java</td>
            <td>Private fields, public getters/setters, and logic validation.</td>
        </tr>
        <tr>
            <td><strong>Abstraction</strong></td>
            <td>IPayable.java, Employee.java</td>
            <td>Interface IPayable and public abstract class Employee.</td>
        </tr>
        <tr>
            <td><strong>Inheritance</strong></td>
            <td>RegularEmployee.java</td>
            <td>class RegularEmployee extends Employee and super().</td>
        </tr>
        <tr>
            <td><strong>Polymorphism</strong></td>
            <td>RegularEmployee.java, PayrollLogic.java</td>
            <td>@Override calculateGrossPay() and processNetPay(Employee emp).</td>
        </tr>
    </tbody>
</table>

<h3>Development Tracking</h3>
<ul>
    <li><strong>Sunny Eljohn Lico:</strong> 
        <ul>
            <li>Reworked the Login feature to support Role-Based access control and Dashboards.</li>
            <li>Fixed and updated the <strong>Payslip Printing feature</strong> with accurate calculations.</li>
            <li>Enhanced Admin capabilities to allow full record viewing and multi-employee payslip printing.</li>
            <li>Successfully transitioned the entire codebase to <strong>OOP Principles</strong>.</li>
        </ul>
    </li>
</ul>

<h3>How to Run</h3>
<ul>
    <li>Open the project in a Java IDE.</li>
    <li>Ensure the CSV data file is in the correct directory.</li>
    <li>Run the application and use the credentials listed in the System Access section.</li>
</ul>
