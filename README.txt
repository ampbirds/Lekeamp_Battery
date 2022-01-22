===============Bank Application=============
Database = H2


1) Create or Update cutomer
Url = http://localhost:8082/api/createOrUpdate?accountId=5&accountNumber=9233&currentBalance=100000&accountName=Test test&accountMob=789876544&accountEmail=a@gmail.com
Method = POST

2)Get all cutomer
Url = http://localhost:8082/api/all
Method = GET

3)Delete Customer using id
Url =http://localhost:8082/api/34 
Method = DELETE

4) Send money (If enough balance)
Url = http://localhost:8082/api/sendmoney?fromAccountNumber=9235&toAccountNumber=9231&amount=5000
Method = POST


5) User statement using account number
Url = http://localhost:8082/api/statement?accountNumber=9231
Method = GET

6) Find customer using account number
Url = http://localhost:8082/api/findByAccountNumber
Method = POST

7) Delete All customer
Url = http://localhost:8082/api/deleteAll
Method = GET

8) Find by id
Url = http://localhost:8082/api/{id}
Method =GET