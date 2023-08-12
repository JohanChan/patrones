const mysql = require('mysql2/promise');

class Connection{

    constructor(db, user, password, host){
        this.db = db;
        this.user = user;
        this.password = password;
        this.host = host;
    }

    getConection(){
        return mysql.createPool({
            host: this.host,
            database: this.db,
            user: this.user,
            password: this.password
        });
    }

    clone(){
        return new Connection(this.db, this.user, this.password, this.host);
    }

}

module.exports.Connection = Connection;