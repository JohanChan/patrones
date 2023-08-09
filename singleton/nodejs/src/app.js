const pool = require('./db/db');
const express = require('express');
const app = express();
const port = 3000;

app.use(express.json());

app.get('/', async (req, res) => {
    
    pool.query('select * from alumnos',[]).then((resultados) => {
        console.log(resultados[0]);
        res.send(resultados[0]);
    }).catch((error) => {
        console.log(error);
    }
    );
}   );

app.listen(port, () => {
    console.log(`Example app listening at http://localhost:${port}`);
}
);


