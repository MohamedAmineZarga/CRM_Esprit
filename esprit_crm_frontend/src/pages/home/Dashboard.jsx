import Sidebar from "../../components/sidebar/Sidebar";
import Navbar from "../../components/navbar/Navbar";
import "./home.scss";
import Widget from "../../components/widget/Widget";
import Featured from "../../components/featured/Featured";
import Chart from "../../components/chart/Chart";
import Table from "../../components/table/Table";
import { BrowserRouter, Routes, Route , Link } from "react-router-dom";


const Dashboard = () => {
  return (
   
    <div>
   
    
      
       <div className="widgets">
       <Widget type="user" />
        <Widget type="order" />
        <Widget type="earning" />
        <Widget type="balance" />
      </div>


      <div className="charts">
        <Featured />
        <Chart title="Last 6 Months (Revenue)" aspect={2 / 1} />
      </div>


      <div className="listContainer">
        <div className="listTitle">Latest Transactions</div>
        <Table />
      </div>


     
      </div>
      
      
  );
};

export default Dashboard;

/*
 <div>
   
    
      
       <div className="widgets">
       <Widget type="user" />
        <Widget type="order" />
        <Widget type="earning" />
        <Widget type="balance" />
      </div>


      <div className="charts">
        <Featured />
        <Chart title="Last 6 Months (Revenue)" aspect={2 / 1} />
      </div>


      <div className="listContainer">
        <div className="listTitle">Latest Transactions</div>
        <Table />
      </div>


     
      </div>
*/