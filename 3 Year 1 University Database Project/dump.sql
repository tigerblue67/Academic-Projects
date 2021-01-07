
SELECT `Title` FROM `project` LEFT JOIN `expense` ON project.ProjectID = expense.ProjectID AND (SELECT SUM(expense.Amount) AS 'Total' FROM `expense` GROUP BY expense.ProjectID)
SELECT * FROM expense;
SELECT `ProjectID`, SUM(`Amount`) AS 'Total' FROM `expense` GROUP BY `ProjectID`
SELECT project.Title, SUM(expense.Amount) FROM `project` LEFT JOIN (SELECT SUM(expense.Amount) AS 'Total' FROM `expense` GROUP BY `ProjectID`)t ON project.ProjectID = t.ProjectID;
SELECT project.Title, SUM(expense.Amount) AS 'Total' FROM `project` LEFT JOIN expense ON project.ProjectID = expense.ProjectID GROUP BY expense.ProjectID

//4
SELECT `FirstName`,`LastName`,`Email`, (SELECT grade.Title FROM grade WHERE employee.GradeID = grade.GradeID) AS 'Grade' FROM `employee` WHERE (SELECT employeeskill.SkillID FROM employeeskill WHERE skill.Title = '%video%') ;
SELECT * FROM skill;
SELECT * FROM employeeskill;

SELECT `FirstName`,`LastName`,`Email`, (SELECT grade.Title FROM grade WHERE employee.GradeID = grade.GradeID) AS 'Grade' FROM `employee` WHERE (SELECT employeeskill.SkillID FROM employeeskill WHERE (SELECT skill.SkillID FROM skill WHERE skill.Title = '%video%') = employeeskill.SkillID) = employee.EmployeeID ;
SELECT * FROM skill;
SELECT * FROM employeeskill;

SELECT `FirstName`,`LastName`,`Email`, (SELECT grade.Title FROM grade WHERE employee.GradeID = grade.GradeID) AS 'Grade' FROM `employee` WHERE (SELECT employeeskill.EmployeeID FROM employeeskill WHERE (SELECT skill.SkillID FROM skill WHERE skill.Title = '%video%') = employeeskill.SkillID) = employee.EmployeeID ;
SELECT * FROM skill;
SELECT * FROM employeeskill;

SELECT `FirstName`,`LastName`,`Email`, (SELECT grade.Title FROM grade WHERE employee.GradeID = grade.GradeID) AS 'Grade' FROM `employee` WHERE employee.EmployeeID IN (SELECT employeeskill.EmployeeID FROM employeeskill WHERE employeeskill.SkillID IN (SELECT skill.SkillID FROM skill WHERE skill.Title LIKE '%video%'));
SELECT * FROM skill;
SELECT * FROM employeeskill;

//7
SELECT skill.Title, COUNT(employeeskill.SkillID) AS 'No. of employees' FROM `skill` INNER JOIN `employeeskill` ON skill.SkillID = employeeskill.SkillID GROUP BY employeeskill.SkillID HAVING COUNT(employeeskill.SkillID) >= 1;
SELECT * FROM skill;
SELECT * FROM employeeskill;
//8
SELECT * FROM `employee`;
SELECT * FROM `equipmentloan`;
SELECT employee.EmployeeID, COUNT(equipmentloan.EmployeeID) AS 'Equipment Loans' FROM `employee` INNER JOIN `equipmentloan` ON employee.EmployeeID = equipmentloan.EmployeeID GROUP BY employee.EmployeeID; 
