//1
//a
SELECT `EquipmentID`,`Make`,`Model`,`Description` FROM `equipment` WHERE `Damaged` = 0;
//b
SELECT `EquipmentID`,`Make`,`Model`,`Description` FROM `equipment` WHERE `EquipmentID` NOT IN (SELECT `EquipmentID` FROM `equipmentloan`);
//c
SELECT `EquipmentID`,`Make`,`Model`,`Description` FROM `equipment` WHERE `Type` LIKE '%video%' OR `Description` LIKE '%video%';
//2
SELECT `EmployeeID`,`FirstName`,`LastName` FROM `employee` WHERE `EmployeeID` IN (SELECT `EmployeeID` FROM `contract` WHERE YEAR(`DueFinish`) = 2019);
//3
SELECT project.Title, SUM(expense.Amount) AS 'Total' FROM `project` LEFT JOIN expense ON project.ProjectID = expense.ProjectID GROUP BY project.ProjectID;
//4
SELECT `FirstName`,`LastName`,`Email`, (SELECT grade.Title FROM grade WHERE employee.GradeID = grade.GradeID) AS 'Grade' FROM `employee` WHERE employee.EmployeeID IN (SELECT employeeskill.EmployeeID FROM employeeskill WHERE employeeskill.SkillID IN (SELECT skill.SkillID FROM skill WHERE skill.Title LIKE '%video%'));
//5
//a
SELECT project.Title, COUNT(assignment.EmployeeID) AS 'No. of employees' FROM `project` LEFT JOIN `assignment` ON project.ProjectID = assignment.ProjectID GROUP BY project.ProjectID HAVING COUNT(assignment.EmployeeID) > 2;
//b
SELECT project.Title, COUNT(assignment.EmployeeID) AS 'No. of employees' FROM `project` LEFT JOIN `assignment` ON project.ProjectID = assignment.ProjectID LEFT JOIN `employee` ON assignment.EmployeeID=employee.EmployeeID WHERE employee.Current =1 GROUP BY project.ProjectID;
//c
SELECT project.Title, COUNT(assignment.EmployeeID) AS 'No. of employees' FROM `project` LEFT JOIN `assignment` ON project.ProjectID = assignment.ProjectID WHERE project.Internal = 0 GROUP BY project.ProjectID;
//6
SELECT employee.EmployeeID,`FirstName`,`LastName` FROM `employee` LEFT OUTER JOIN `assignment` ON employee.EmployeeID = assignment.EmployeeID WHERE assignment.EmployeeID IS NULL;
//7
SELECT skill.Title, COUNT(employeeskill.SkillID) AS 'Number of Skilled employees' FROM `skill` INNER JOIN `employeeskill` ON skill.SkillID = employeeskill.SkillID GROUP BY employeeskill.SkillID HAVING COUNT(employeeskill.SkillID) >= 1;
//8
SELECT employee.EmployeeID, COUNT(equipmentloan.EmployeeID) AS 'Equipment Loans' FROM `employee` INNER JOIN `equipmentloan` ON employee.EmployeeID = equipmentloan.EmployeeID WHERE equipmentloan.Current = 1 GROUP BY employee.EmployeeID;
//9
SELECT employee.EmployeeID, COUNT(equipmentloan.EmployeeID) AS 'All Time Loans' FROM `employee` INNER JOIN `equipmentloan` ON employee.EmployeeID = equipmentloan.EmployeeID GROUP BY employee.EmployeeID;
//10
SELECT payslip.EmployeeID, payslip.PayslipID FROM `payslip` INNER JOIN `contract` ON payslip.EmployeeID = contract.EmployeeID WHERE payslip.Payday BETWEEN '2017-01-01' AND '2017-12-31' AND payslip.Payday > contract.DueFinish;
