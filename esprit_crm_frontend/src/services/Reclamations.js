import axios from 'axios';


const RECLAMATION_API_BASE_URL = "http://localhost:8090/api/v1/Reclamations";


class Reclamations {

    getReclamations(){
        return axios.get(RECLAMATION_API_BASE_URL);
    }


    deleteReclamations(id_r){
        return axios.delete(RECLAMATION_API_BASE_URL + '/' + id_r);
    }

    createReclamations(reclamation){
        return axios.post(RECLAMATION_API_BASE_URL, reclamation);
 
    }

   

  
}

export default new Reclamations()