import React, {Fragment, useState} from 'react';
import axios from "axios"
import { Bar } from 'react-chartjs-2';
import {Chart as ChartJS} from "chart.js/auto"
import { useEffect } from 'react';




function BarChart() {

  let [month, setMonth]=useState([]);
  let [income, setIncome]=useState([]);


  const makeAxiosCall=async ()=>{  
    var mon=[];
    var inc=[];
    try{
      const url="http://localhost:9090/incmexptally/past";
      let res=await axios.get(url);
      console.log(res);
        for(const dataObj of res.data){
          mon.push(dataObj.remark.substring(0,6));
          inc.push(parseInt(dataObj.amount));
        }
      setMonth(mon);
      setIncome(inc);
      }catch(err){
      // <Link to="/error-page"></Link>
      console.log(err);
    };
  }



  useEffect(()=>{
    makeAxiosCall();
  },[])

  
  console.log("month"+month);
  console.log("income"+income);

  const data = {
  labels: month,
  datasets: [
    {
      label: 'income',
      data:income,
      backgroundColor: 'rgba(251, 232, 166, 0.5) ',
      borderColor: 'rgba(251, 232, 166, 1)',
      borderWidth: 1,
      barThickness:50,
      hoverBackgroundColor:'rgba(48, 60, 108, 0.3) '
    },
  ],
};
 
  return (
    <div style={{width:"500px"}}>
      <Bar data={data}/>
    </div>
  );
}

export default BarChart;