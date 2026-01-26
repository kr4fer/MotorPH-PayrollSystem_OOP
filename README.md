<h1 align="center">MotorPH Payroll System</h1>

<h3>Project Overview</h3>
<p>
  This Java-based payroll system is developed for <b>MotorPH</b> to streamline employee management and automate <b>weekly salary computations</b>. It features integrated calculations for government-mandated deductions, including <b>SSS, PhilHealth, Pag-IBIG, and withholding tax</b>.
</p>

<ul>
  <li><b>GUI:</b> Java Swing</li>
  <li><b>Storage:</b> Text-based data retrieval</li>
  <li><b>Supported IDs:</b> 10001, 10002, 10003, and higher</li>
</ul>

<hr>

<h3>System Access</h3>
<p><b>Username:</b> <code>admin</code><br>
<b>Password:</b> <code>1234</code></p>

<hr>

<h3>OOP Principles Applied</h3>
<p>As a developer on this project, I implemented the four pillars of Object-Oriented Programming:</p>

<ol style="list-style-type: disc; padding-left: 25px;">
  <li><b>Encapsulation:</b> Applied in <code>Employee.java</code> using <i>this</i> keywords and <i>getters/setters</i>.</li>
  <li><b>Abstraction:</b> Implemented via the <code>grossPay.java</code> interface for salary logic.</li>
  <li><b>Inheritance:</b> Established a hierarchy between <code>Employee.java</code> and <code>regularEmployee.java</code>.</li>
  <li><b>Polymorphism:</b> Utilized for flexible implementation of salary computations across class types.</li>
</ol>

<p><i>Refer to the source files above for specific implementation details.</i></p>
