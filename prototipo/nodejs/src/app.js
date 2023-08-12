const express = require('express');
const app = express();
const { Connection } = require('./db');


app.get('/', async (req, res) => {
    const connection = new Connection('prueba', 'root', 'pass*', 'localhost');

    const conn2 = connection.clone();
    console.log(conn2);
    console.log(connection);
    conn2.host = 'localhost';
    conn2.password = 'Underoath97*';
    const result2  = await conn2.getConection().query('select * from alumnos', []);
    
    res.send(result2[0]);
});

app.listen(3000, () => {
    console.log('Example app listening on port 3000!');
});