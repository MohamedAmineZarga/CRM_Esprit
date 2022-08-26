import "./sidebar.scss";
import DashboardIcon from "@mui/icons-material/Dashboard";
import PersonOutlineIcon from "@mui/icons-material/PersonOutline";
import LocalShippingIcon from "@mui/icons-material/LocalShipping";
import CreditCardIcon from "@mui/icons-material/CreditCard";
import StoreIcon from "@mui/icons-material/Store";
import InsertChartIcon from "@mui/icons-material/InsertChart";
import SettingsApplicationsIcon from "@mui/icons-material/SettingsApplications";
import ExitToAppIcon from "@mui/icons-material/ExitToApp";
import NotificationsNoneIcon from "@mui/icons-material/NotificationsNone";
import SettingsSystemDaydreamOutlinedIcon from "@mui/icons-material/SettingsSystemDaydreamOutlined";
import PsychologyOutlinedIcon from "@mui/icons-material/PsychologyOutlined";
import AccountCircleOutlinedIcon from "@mui/icons-material/AccountCircleOutlined";
import { Link } from "react-router-dom";
import { DarkModeContext } from "../../context/darkModeContext";
import { useContext } from "react";

const Sidebar = () => {
  const { dispatch } = useContext(DarkModeContext);
  return (
    <div className="sidebar">
      <div className="top">
        <Link to="dashboard" style={{ textDecoration: "none" }}>
          <span className="logo">CRM ESPRIT</span>
        </Link>
      </div>
      <hr />
      <div className="center">
        <ul>
          
          <p className="title">CRM Esprit</p>
          <li>
          <Link to="dashboard" style={{ textDecoration: "none" }}>
            <DashboardIcon className="icon" />
            <span>Dashboard</span>
            </Link>
          </li>
          <p className="title">Tables</p>
          <Link to="datatable" style={{ textDecoration: "none" }}>
            <li>
              <PersonOutlineIcon className="icon" />
              <span>Utilisateur</span>
            </li>
          </Link>
          <Link to="reclamation" style={{ textDecoration: "none" }}>
            <li>
              <NotificationsNoneIcon className="icon" />
              <span>Réclamation</span>
            </li>
          </Link>
          <Link to="/products" style={{ textDecoration: "none" }}>
          <li>
            <LocalShippingIcon className="icon" />
            <span>Services</span>
          </li>
          </Link>
          
          
          <p className="title">Formulaires</p>
          <Link to="/users" style={{ textDecoration: "none" }}>
            <li>
              <PersonOutlineIcon className="icon" />
              <span>Utilisateur</span>
            </li>
          </Link>
          <Link to="reclamationform" style={{ textDecoration: "none" }}>
            <li>
              <NotificationsNoneIcon className="icon" />
              <span>Réclamation</span>
            </li>
          </Link>
          <Link to="/products" style={{ textDecoration: "none" }}>
          <li>
            <LocalShippingIcon className="icon" />
            <span>Services</span>
          </li>
          </Link>
          <p className="title">USER</p>
          <li>
            <AccountCircleOutlinedIcon className="icon" />
            <span>Profile</span>
          </li>
          <li>
            <ExitToAppIcon className="icon" />
            <span>Se déconnecter</span>
          </li>
        </ul>
      </div>
      <div className="bottom">
        
      </div>
    </div>
  );
};

export default Sidebar;
