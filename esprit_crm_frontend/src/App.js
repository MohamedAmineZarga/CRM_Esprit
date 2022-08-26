import Home from "./pages/home/Home";
import Dashboard from "./pages/home/Dashboard";

import Login from "./pages/login/Login";
import List from "./pages/list/List";
import Single from "./pages/single/Single";
import New from "./pages/new/New";
import Sidebar from "./components/sidebar/Sidebar";
import Navbar from "./components/navbar/Navbar";
import Datatable from "./components/datatable/Datatable";
import Table from "./components/table/Table";
import Reclamationform from "./components/form/Reclamation";




import Reclamation from "./components/table/ReclamationTable";



import { BrowserRouter, Routes, Route , Link } from "react-router-dom";
import { productInputs, userInputs } from "./formSource";
import "./style/dark.scss";
import { useContext } from "react";
import { DarkModeContext } from "./context/darkModeContext";

function App() {
  const { darkMode } = useContext(DarkModeContext);

  return (
    
    <div className={darkMode ? "app dark" : "app"}>
      
      <BrowserRouter>
        <Routes>
        <Route path="/" element={<Reclamationform />} />
      
        <Route path="home" element={<Home />}>
        <Route path="datatable" element={<Datatable />} />
        <Route path="table" element={<Table />} />

        <Route path="reclamation" element={<Reclamation />} />
        <Route path="reclamationform" element={<Reclamationform />} />

        


        <Route path="dashboard" element={<Dashboard />} />
          </Route>

        <Route path="login" element={<Login />} />  
      
        
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
