const express = require("express")
const app = express();
const mysql = require('mysql2');

const parseUrl = require('body-parser');
let encodeUrl = parseUrl.urlencoded({ extended: false });

const con = mysql.createConnection({
    host: "localhost",
    user: "root", // my username
    password: "Merlin_2", // my password
    database: "registration_db"
});

app.get('/',(req, res)=>{
    // res.send("Hello, world!");
    res.sendFile(__dirname + '/register.html')
});
app.post('/signup', encodeUrl,(req, res) => {
   const username = req.body.username 
   const email = req.body.email 
   const password = req.body.password 
   console.log(username,email,password)
   var sql = `INSERT INTO users (username, email, password) VALUES ('${username}', '${email}', '${password}')`;
   con.query(sql, (err, result) => {
    if (err) {
        console.log(err)
    } else {
        console.log("success")
        res.send("<h1>success</h1>")
    }
   })
})

app.listen(5500,()=>{
    console.log("Server running on port 5500");
});