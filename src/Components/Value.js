import { MongoClient } from 'mongodb';
const uri = "mongodb+srv://jade_yana:Deadp00l@clusterajg-awpjf.mongodb.net/test?retryWrites=true&w=majority";
const client = new MongoClient(uri, { useNewUrlParser: true });
client.connect(err => {
    const collection = client.db("test").collection("hiredhyperspace");
    // perform actions on the collection object
    client.close();
});


var url = "mongodb://localhost:27017/";

MongoClient.connect(url, function(err, db) {
    if (err) throw err;
    var dbo = db.db("test");
    dbo.collection("hiredhyperspace").find({}).toArray(function(err, result) {
        if (err) throw err;
        console.log(result);
        db.close();
    });
});


MongoClient.connect(url, function(err, db) {
    if (err) throw err;
    var dbo = db.db("test");
    var query = { address: /^S/ };
    dbo.collection("hiredhyperspace").find(query).toArray(function(err, result) {
        if (err) throw err;
        console.log(result);
        db.close();
    });
});

MongoClient.connect(url, function(err, db) {
    if (err) throw err;
    var dbo = db.db("test");
    dbo.collection("hiredhyperspace").find({}, { projection: { _id: 0, firstName: 1, middleName: 1, lastName: 1, preferredName: 1 } }).toArray(function(err, result) {
        if (err) throw err;
        console.log(result);
        db.close();
    });
});

MongoClient.connect(url, function(err, db) {
    if (err) throw err;
    var dbo = db.db("mydb");
    var myquery = { id: "" };
    var newvalues = { $set: { firstName: "", middleName: "", lastName: "", preferredName: "", age: "", dob: "", gender: "", maritalStatus: "", email: "", phone: "", address: "", city: "", state: "", zip: "", medicalConditions: "", military: "", hireDate: "" } };
    dbo.collection("hiredhyperspace").updateOne(myquery, newvalues, function(err, res) {
        if (err) throw err;
        console.log("1 document updated");
        db.close();
    });
});

MongoClient.connect(url, function(err, db) {
    if (err) throw err;
    var dbo = db.db("test");
    dbo.collection("hiredhyperspace").find({}).toArray(function(err, result) {
        if (err) throw err;
        console.log(result);
        db.close();
    });
});


MongoClient.connect(url, function(err, db) {
    if (err) throw err;
    var dbo = db.db("mydb");
    var myquery = { id: "" };
    var newvalues = { $set: { firstName: "", middleName: "", lastName: "", preferredName: "", age: "", dob: "", gender: "", maritalStatus: "", email: "", phone: "", address: "", city: "", state: "", zip: "", medicalConditions: "", military: "", hireDate: "" } };
    dbo.collection("hiredhyperspace").updateOne(myquery, newvalues, function(err, res) {
        if (err) throw err;
        console.log("1 document updated");
        db.close();
    });
});


// import React from 'react';
// import * as api from '../utils/api';

// class Values extends React.Component {
//     state = {
//         values: []
//     };

// callValues = () => {
//         api.fetchValues().then(response => {
//             console.log('callValues: ', response);
//             this.setState(() => {
//                 return {
//                     values: response
//                 };
//             });
//             console.log('after SetState: ', this.state.values);
//         });
//     };

// componentDidMount() {
//         this.callValues();
//         console.log('componentDidMount: ', this.state.values);
//     }

// render() {
//         return <div>{this.state.values}</div>;
//     }
// }

// export default Values;