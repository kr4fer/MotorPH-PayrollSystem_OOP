<h1>MotorPH Payroll System</h1>

<h3>Project Overview</h3>
<ul>
    <li><strong>Purpose:</strong> A Java-based payroll system for MotorPH to streamline employee management and automate salary computations.</li>
    <li><strong>Tech Stack:</strong> Built using <strong>Java Swing</strong> for the GUI and <strong>CSV/Text files</strong> for data storage (managed via the OpenCSV library).</li>
    <li><strong>Core Functions:</strong> Automated calculations for SSS, PhilHealth, Pag-IBIG, and Withholding Tax.</li>
    <li><strong>Development Note:</strong> This system has been successfully transitioned to a full <strong>Object-Oriented Programming (OOP)</strong> architecture, following the <strong>Model-View-Controller (MVC)</strong> pattern for professional-grade code organization.</li>
</ul>

<h3>System Access & User Credentials</h3>
<p>The system utilizes the <code>FileHandler</code> class to authenticate users and direct them to specific dashboards based on their credentials:</p>

<h4>1. Administrator</h4>
<ul>
    <li><strong>Username:</strong> admin</li>
    <li><strong>Password:</strong> 1234</li>
    <li><strong>Features:</strong> Full access to the Admin Dashboard (Create, Read, Update, Delete) and the ability to view all employee records and print payslips.</li>
</ul>

<h4>2. Regular Employee</h4>
<ul>
    <li><strong>Username:</strong> [Employee ID] (e.g., 10001)</li>
    <li><strong>Password:</strong> [Last Name] (e.g., Garcia)</li>
    <li><strong>Features:</strong> Access to personal information and the ability to view/print their individual payslips.</li>
</ul>

<h3>Core OOP Principles Implementation</h3>

<h4>1. Encapsulation (Data Security & Integrity)</h4>
<p><strong>What it is:</strong> The practice of bundling data (fields) and methods into a single unit (class) and restricting direct access to internal components.</p>

<ul>
    <li><strong>Relevance:</strong> It ensures <strong>Data Integrity</strong>. By making fields private, the system prevents external classes from accidentally corrupting data (e.g., setting a salary to a negative number).</li>
    <li><strong>Where to see it:</strong>
        <ul>
            <li><code>Benefits.java</code>: All fields like <code>riceSubsidy</code> are <strong>private</strong>. Access is only possible through public getters like <code>getRiceSubsidy()</code>.</li>
            <li><code>Employee.java</code>: Uses <strong>protected</strong> fields to allow child classes to access data while keeping it hidden from the rest of the application.</li>
        </ul>
    </li>
</ul>

<h4>2. Abstraction (The Blueprinting)</h4>
<p><strong>What it is:</strong> Hiding complex implementation details and showing only the essential features of an object.</p>

<ul>
    <li><strong>Relevance:</strong> It reduces <strong>Complexity</strong>. The GUI doesn't need to know the SSS tax brackets; it just calls a method and gets the result.</li>
    <li><strong>Where to see it:</strong>
        <ul>
            <li><code>IPayable.java</code>: An <strong>Interface</strong> that defines the "contract" requiring a <code>calculateGrossPay()</code> method.</li>
            <li><code>Employee.java</code>: Defined as an <strong>Abstract Class</strong>; you cannot create a generic Employee, only specific types.</li>
            <li><code>Deductions.java</code>: Hides complex government tax matrices behind simple method calls like <code>calculateSSS()</code>.</li>
        </ul>
    </li>
</ul>

<h4>3. Inheritance (Code Reusability)</h4>
<p><strong>What it is:</strong> A mechanism where one class (child) acquires the properties and behaviors of a parent class.</p>
<ul>
    <li><strong>Relevance:</strong> It promotes <strong>Code Reusability</strong>. Common logic like "First Name" and "Last Name" is handled once in the parent class.</li>
    <li><strong>Where to see it:</strong>
        <ul>
            <li><code>RegularEmployee.java</code>: Uses <code>extends Employee</code> to inherit attributes and uses <code>super()</code> to initialize them consistently.</li>
        </ul>
    </li>
</ul>

<h4>4. Composition (The "Has-A" Relationship)</h4>
<p><strong>What it is:</strong> A design technique where a class contains an instance of another class as a field.</p>
<ul>
    <li><strong>Relevance:</strong> It makes the system <strong>Flexible</strong>. Instead of an Employee having 20 different variables for money, they simply "have" a <code>Benefits</code> object.</li>
    <li><strong>Where to see it:</strong>
        <ul>
            <li><code>Employee.java</code>: The field <code>protected Benefits benefits;</code> establishes that an Employee <strong>has</strong> a Benefits package.</li>
        </ul>
    </li>
</ul>

<h4>5. Polymorphism (Flexibility)</h4>
<p><strong>What it is:</strong> The ability of an object to take on many forms.</p>
<ul>
    <li><strong>Relevance:</strong> It allows for <strong>Scalability</strong>. The system can handle a list of <code>Employee</code> objects, and Java automatically triggers the correct calculation logic for each specific type.</li>
    <li><strong>Where to see it:</strong>
        <ul>
            <li><code>RegularEmployee.java</code>: Uses <code>@Override</code> on <code>calculateGrossPay()</code>. Even when treated as a generic Employee, the Regular-specific math runs.</li>
        </ul>
    </li>
</ul>

<h3>Summary Table of OOP in Your Project</h3>
<table border="1" style="width:100%; border-collapse: collapse; text-align: left;">
    <tr style="background-color: #f2f2f2;">
        <th>OOP Principle</th>
        <th>File(s) Involved</th>
        <th>Specific Implementation Detail</th>
    </tr>
    <tr>
        <td><strong>Encapsulation</strong></td>
        <td>Benefits.java, Employee.java</td>
        <td>Use of private/protected access modifiers and Getters/Setters.</td>
    </tr>
    <tr>
        <td><strong>Abstraction</strong></td>
        <td>IPayable.java, Employee.java</td>
        <td>Use of an interface and abstract methods to define blueprints.</td>
    </tr>
    <tr>
        <td><strong>Inheritance</strong></td>
        <td>RegularEmployee.java</td>
        <td>Use of <code>extends</code> to inherit attributes from the parent class.</td>
    </tr>
    <tr>
        <td><strong>Composition</strong></td>
        <td>Employee.java, FileHandler.java</td>
        <td>Bundling rice, phone, and clothing allowances into a <code>Benefits</code> object.</td>
    </tr>
    <tr>
        <td><strong>Polymorphism</strong></td>
        <td>RegularEmployee.java</td>
        <td>Overriding the <code>calculateGrossPay()</code> method for specific logic.</td>
    </tr>
</table>

<ul>
    <li><strong>Interface (IPayable):</strong> Defines the contract that any payable entity must implement.</li>
    <li><strong>Abstraction (Employee):</strong> A base template that provides shared attributes (ID, Name) but remains abstract to prevent instantiation of a "generic" employee.</li>
    <li><strong>Composition (Benefits):</strong> The <code>Employee</code> class contains a <code>Benefits</code> object, allowing for modular updates to allowances without changing the main employee logic.</li>
    <li><strong>Inheritance (RegularEmployee):</strong> Specifically extends <code>Employee</code> to provide logic for salaried staff.</li>
</ul>

<h3>Why This Helps Your System</h3>
<ul>
    <li><strong>Organized Data:</strong> Instead of <code>FileHandler</code> returning raw string arrays, it now returns structured <code>Employee</code> objects.</li>
    <li><strong>Easier Maintenance:</strong> Changes to SSS or PhilHealth rates only require updating <code>Deductions.java</code>.</li>
    <li><strong>Professional Architecture:</strong> The system follows the <strong>MVC</strong> pattern:
        <ul>
            <li><strong>Model:</strong> Employee.java, Benefits.java, Attendance.java (Data)</li>
            <li><strong>View:</strong> ViewEmployeePanel.java (User Interface)</li>
            <li><strong>Controller:</strong> PayrollLogic.java, FileHandler.java (Business Logic)</li>
        </ul>
    </li>
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
            <li><strong>Lead Architect:</strong> Successfully transitioned the procedural codebase into a structured OOP/MVC architecture.</li>
        </ul>
    </li>
</ul>

<h3>How to Run</h3>
<ul>
    <li>Open the project in a Java IDE (e.g., NetBeans, IntelliJ, or Eclipse).</li>
    <li>Ensure <code>employee.txt</code> and <code>attendance.txt</code> are located in the <code>data</code> folder.</li>
    <li>Run the application and use the credentials provided in the System Access section.</li>
</ul>

