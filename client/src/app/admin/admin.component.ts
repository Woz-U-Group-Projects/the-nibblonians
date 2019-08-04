import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import * as $ from 'jquery';
import 'datatables.net';
import 'datatables.net-bs4';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  //array of new hires
  newbies: any[];

  //future instance of data table
  dataTable: any;
  
  // Adding a reference to the change detector in our constructor 
constructor(private http: HttpClient, private chRef: ChangeDetectorRef) {} 

  public barChartOptions = {
    scaleShowVerticalLines: false,
    responsive: true
  };

  public barChartLabels = ['2011', '2012', '2013', '2014', '2015', '2016', '2017', '2018', '2019'];
  public barChartType = 'bar';
  public barChartLegend = true;
  public barChartData = [
    {data: [65, 59, 80, 81, 56, 55, 66, 89, 25], label: '# Hired'}
    // {data: [28, 48, 40, 19, 86, 27, 90], label: 'Series B'}
  ];


  ngOnInit() {
    this.http.get('https://5d4393362c6da100147e327c.mockapi.io/api/v1/newbies')
    .subscribe((data: any[]) => {
    
    this.newbies = data;

    // You'll have to wait that changeDetection occurs and projects data into 
    // the HTML template, you can ask Angular to that for you ;-)
    this.chRef.detectChanges();

    // Now you can use jQuery DataTables :
    const table: any = $('table');
    $('table').DataTable({
      "pagingType": "simple"
    });
    this.dataTable = table.DataTable();
  });
}}
