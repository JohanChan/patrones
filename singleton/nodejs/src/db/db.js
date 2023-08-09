const mysql = require('mysql2/promise');
class Database {
    constructor(config) {
        this.connection = mysql.createPool(config);
    }
    query(sql, args) {
        return this.connection.query(sql, args);
    }
    close() {
        return this.connection.end();
    }
}

module.exports = new Database({
    host: 'localhost',
    database: '',
    user: '',
    password: '',
    waitForConnections: true,
    connectionLimit: 10,
    queueLimit: 0
});


// const pool = mysql.createPool({
//     host: 'localhost',
//     database: 'prueba',
//     user: 'root',
//     password: 'Underoath97*'
// });

// module.exports = pool;