import "./table.scss";
import { DataGrid } from "@mui/x-data-grid";
import { userColumns, userRows } from "../../datatablesource";
import { Link } from "react-router-dom";
import { useState } from "react";

import "./table.scss";
import Table from "@mui/material/Table";
import TableBody from "@mui/material/TableBody";
import TableCell from "@mui/material/TableCell";
import TableContainer from "@mui/material/TableContainer";
import TableHead from "@mui/material/TableHead";
import TableRow from "@mui/material/TableRow";
import Paper from "@mui/material/Paper";

import React, { Component } from 'react';
import Reclamations from '../../services/Reclamations';

class ReclamationTable extends Component {
    
    constructor(props) {
        super(props)
        this.state = {
            reclamations: []
        }

        this.deleteReclamations = this.deleteReclamations.bind(this);

    }
    

    deleteReclamations(id_r){
        Reclamations.deleteReclamations(id_r).then( res => {
            this.setState({reclamations: this.state.reclamations.filter(reclamations => reclamations.id_r !== id_r)});
        });
    }


    componentDidMount(){

        
        Reclamations.getReclamations().then( (res) =>{
              //  let employee = res.data;
                this.setState({reclamations: res.data
                });
            });
        }        
    
    
    
    
    
    render() {
        return (

            <div>


<div className="tableTitle">
      <center>Liste des réclamations</center>  
      </div>



<TableContainer component={Paper} className="table">
      <Table sx={{ minWidth: 650 }} aria-label="simple table">
        <TableHead>
         
            <TableCell className="tableCell">ID</TableCell>
            <TableCell className="tableCell">Date</TableCell>
            <TableCell className="tableCell">Type</TableCell>
            <TableCell className="tableCell">Description</TableCell>
        
        </TableHead>
        <TableBody>
          {this.state.reclamations.map(
                                   reclamation =>  (
            <TableRow key={reclamation.id}>
             
              <TableCell className="tableCell">{reclamation.id_r}</TableCell>
              <TableCell className="tableCell">{reclamation.date}</TableCell>
              <TableCell className="tableCell">{reclamation.typeR}</TableCell>
              <TableCell className="tableCell">{reclamation.description}</TableCell>
              <TableCell className="tableCell"><button style={{marginLeft: "10px"}} onClick={ () => this.deleteReclamations(reclamation.id_r)} className="btn btn-danger">Supprimer </button></TableCell>
              
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>















      
       </div>
        );
    }

}

export default ReclamationTable;