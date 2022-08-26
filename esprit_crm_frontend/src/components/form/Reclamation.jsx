import React, { Component } from 'react';
import Reclamations from '../../services/Reclamations';
import { useNavigate, Link } from "react-router-dom";
import "./form.scss";



class Reclamation extends Component {



    


    constructor(props) {
        super(props)

        this.state = {
            // step 2
            id_r: '',  //id_r: this.props.match.params.id_r,
            date: '',
            description: '',
            typeR: ''
        }
        this.changeDateHandler = this.changeDateHandler.bind(this);
        this.changeDescriptionHandler = this.changeDescriptionHandler.bind(this);
        this.saveOrUpdateReclamations = this.saveOrUpdateReclamations.bind(this);
    }


//Title of the form
    getTitle(){
        if(this.state.id_r === '_add'){
            return <h3 className="text-center">Add Reclamation</h3>
        }else{
            return <h3 className="text-center">Add Reclamation</h3>
        }
    }



    changeDateHandler= (event) => {
        this.setState({date: event.target.value});
    }
    changeTypeRHandler= (event) => {
        this.setState({typeR: event.target.value});
    }
    changeDescriptionHandler= (event) => {
        this.setState({description: event.target.value});
    }
   
    saveOrUpdateReclamations = (e) => {
        e.preventDefault();
        let reclamation = {date: this.state.date, description: this.state.description, typeR: this.state.typeR};
        console.log('reclamation => ' + JSON.stringify(reclamation));

        // step 5
       /* if(this.state.id === '_add'){*/
       Reclamations.createReclamations(reclamation).then(res =>{
            });

            
             /*
        }else{
            ReclamationTableService.updateEmployee(employee, this.state.id).then( res => {
                this.props.history.push('/employees');
            });
        }*/
    }



    render() {

    

        const red = {
            margin: "1rem",
            textDecoration: "none",
            color: 'White',
            backgroundColor: 'red',
            width: "30 px",
          };
          const green = {
            margin: "1rem",
            textDecoration: "none",
            color: 'White',
            backgroundColor: 'green',
            width: "30 px",
          };
        return (
            <div>
                <br></br>
                   <div className = "container">
                        <div className = "row">
                            <div className = "card col-md-6 offset-md-3 offset-md-3">
                                {
                                    this.getTitle()
                                }
                                <div className = "card-body">
                                    <form >
                                        <div className="form-box">
                                        <div className = "form-group">
                                            <label> Type :</label>
                                            <input placeholder="Type :"  name="Type :" className="form-control" 
                                                onChange={this.changeTypeRHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> Description : </label>
                                            <input placeholder="Description"  name="Description" className="form-control" 
                                                 onChange={this.changeDescriptionHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> Date </label>
                                            <input type="date" name="Date"
       
       min="2018-01-01" max="2025-12-31"  onChange={this.changeDateHandler}/>
                                        </div>

                                    

                                     <button   className="btn btn-success" onClick={this.saveOrUpdateReclamations}>  <Link to="../reclamation" >Save</Link></button>
                                        <Link style={red} to="../reclamation" className="btn btn-primary">test</Link>
                                       
                                       </div>
                                    </form>
                                </div>
                            </div>
                        </div>

                   </div>
            </div>
        );
    }
}

export default Reclamation;