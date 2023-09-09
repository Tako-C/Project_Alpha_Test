

const express = require('express');
const bodyParser = require('body-parser');
const mysql = require('mysql2');
const path = require('path');

const app = express();
const port = 5500;

// กำหนดการใช้งาน bodyParser สำหรับรับข้อมูลจาก form ในรูปแบบ URL-encoded
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());
app.use(express.json());

// กำหนดการเชื่อมต่อฐานข้อมูล MySQL
const db = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: 'Merlin_2',
  database: 'registration_db'
});

// เชื่อมต่อกับฐานข้อมูล
db.connect((err) => {
  if (err) {
    console.error('Database connection failed: ', err);
  } else {
    console.log('Connected to the database');
  }
});

// เรียกหน้าฟอร์มสมัครสมาชิก
app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, '/signup.html'));
});

// รับข้อมูลจากฟอร์มและเพิ่มลงในฐานข้อมูล
app.post('/signup', (req, res) => {
    console.log("test url post")
    res.send('POST request received');
  const userData = {
    username: req.body.username,
    email: req.body.email,
    password: req.body.password
  };
  const sql = 'INSERT INTO users (username, email, password) VALUES (?, ?, ?)';
  console.log(userData)
  db.query(sql, userData, (err, result) => {
    if (err) {
      console.error('Error inserting data: ', err);
      res.status(403).json({ message: 'err' });
    } else {
      console.log('Data inserted');
      res.status(200).json({ message: 'ok' });
    }
  });
});

app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});
