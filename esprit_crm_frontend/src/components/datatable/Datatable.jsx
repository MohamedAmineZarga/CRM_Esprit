import "./datatable.scss";
import { DataGrid } from "@mui/x-data-grid";
import { userColumns, userRows ,userData } from "../../datatablesource";
import { Link } from "react-router-dom";
import React, { useState, useEffect } from 'react'


const Datatable = () => {
  const [data, setData] = useState(userRows);

 const RECLAMATION_API_BASE_URL = "http://localhost:8090/api/v1/Reclamations";

  const handleDelete = (id) => {
    setData(data.filter((item) => item.id !== id));
  };

  const handleGetRowId = (e) => {
        return e.id_r
    }

//http://localhost:8090/api/v1/Reclamations
//https://jsonplaceholder.typicode.com/posts
//http://172.17.0.104/api/v1/Reclamations
//return axios.get(RECLAMATION_API_BASE_URL);
  const [tableData, setTableData] = useState([])
  useEffect(() => {
    fetch("/api/v1/Reclamations")
      .then((data) => data.json())
      .then((data) => setTableData(data))
  }, [])

  
  const columns = [
    { field: 'id_r', headerName: 'ID' },
    { field: 'typeR', headerName: 'Type', width: 300 },
    { field: 'description', headerName: 'Description', width: 300},
    { field: 'date', headerName: 'Date', width: 200 }
  ]
  const actionColumn = [
    {
      field: "action",
      headerName: "Action",
      width: 200,
      renderCell: (params) => {
        return (
          <div className="cellAction">
          
            <div
              className="deleteButton"
              onClick={() => handleDelete(params.row.id)}
            >
              Delete
            </div>
          </div>
        );
      },
    },
  ];
  return (
    <div className="datatable">
      <div className="datatableTitle">
        Add New User
        <Link to="/users/new" className="link">
          Add New
        </Link>
      </div>
      <DataGrid
        className="datagrid"
        rows={tableData}
        getRowId={(tableData) => tableData.id_r}
        columns={columns.concat(actionColumn)}
        pageSize={9}
        rowsPerPageOptions={[8]}
        
      />
    </div>
  );
};

export default Datatable;
