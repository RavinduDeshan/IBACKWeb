
<!DOCTYPE html>
<html lang="en">

<head>
    <style>
    .content{
        margin-top: 0%;
    }    
    .logodiv{
         align: center;
         width: 400px;
        }

        
    </style>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="../assets/img/favicon.png">
  <title>
    IBACK Events Dashboard
  </title>
  <!--     Fonts and icons     -->
  <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,600,700,800" rel="stylesheet" />
  <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
  <!-- Nucleo Icons -->
  <link href="../assets/css/nucleo-icons.css" rel="stylesheet" />
  <!-- CSS Files -->
  <link href="../assets/css/black-dashboard.css?v=1.0.0" rel="stylesheet" />
  <!-- CSS Just for demo purpose, don't include it in your project -->
  <link href="../assets/demo/demo.css" rel="stylesheet" />
  
  <style>
.footer {
  position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  text-align: center;
}
</style>
</head>

<body class="">
    <center><div class="logodiv"> <img class="" src="assets/img/logo3.png" alt="..."></div></center>
    
  <div class="wrapper">
    <div class="sidebar">
      <!--
        Tip 1: You can change the color of the sidebar using: data-color="blue | green | orange | red"
    -->
      <div class="sidebar-wrapper">
        <div class="logo">
          <a href="javascript:void(0)" class="simple-text logo-mini">
            EO
          </a>
          <a href="javascript:void(0)" class="simple-text logo-normal">
           Event Organizer
          </a>
        </div>
        <ul class="nav">
          <li class="active ">
            <a href="./eventManagement.html">
              <i class="tim-icons icon-chart-pie-36"></i>
              <p>Event Dashboard</p>
            </a>
          </li>
          <li class="active ">
              <a href="./customerManagement.html">
                <i class="tim-icons icon-chart-pie-36"></i>
                <p>Dashboard</p>
              </a>
            </li>
            <li class="active ">
                <a href="./supplierManagement.html">
                  <i class="tim-icons icon-chart-pie-36"></i>
                  <p>Supplier Dashboard</p>
                </a>
              </li>
          <li>
            <a href="./event.html">
              <i class="tim-icons icon-tap-02"></i>
              <p>Events</p>
            </a>
          </li>
          <li>
            <a href="./map.html">
              <i class="tim-icons icon-single-02"></i>
              <p>Users</p>
            </a>
          </li>
          <li>
            <a href="./notifications.html">
              <i class="tim-icons icon-bell-55"></i>
              <p>Feedback</p>
            </a>
          </li>
          <li>
            <a href="./user.html">
              <i class="tim-icons icon-email-85"></i>
              <p>Payemnts</p>
            </a>
          </li>
          <li>
            <a href="./tables.html">
              <i class="tim-icons icon-notes "></i>
              <p>Packages</p>
            </a>
          </li>
          <li>
            <a href="./tables.html">
              <i class="tim-icons icon-notes "></i>
              <p>Event Calender</p>
            </a>
          </li>
          <li>
            <a href="./Remove Customer.html">
              <i class="tim-icons icon-notes "></i>
              <p>Suspend Accounts</p>
            </a>
          </li>
          <li>
            <a href="./Customer Inquery.html">
              <i class="tim-icons icon-notes "></i>
              <p>Customer Inqueries</p>
            </a>
          </li>
        </ul>
      </div>
    </div>
    <div class="main-panel">
      <!-- Navbar -->
      <nav class="navbar navbar-expand-lg navbar-absolute navbar-transparent">
        <div class="container-fluid">
          <div class="navbar-wrapper">
            <div class="navbar-toggle d-inline">
              <button type="button" class="navbar-toggler">
                <span class="navbar-toggler-bar bar1"></span>
                <span class="navbar-toggler-bar bar2"></span>
                <span class="navbar-toggler-bar bar3"></span>
              </button>
            </div>
            <a class="navbar-brand" href="javascript:void(0)" hidden="true">Dashboard</a>
          </div>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-bar navbar-kebab"></span>
            <span class="navbar-toggler-bar navbar-kebab"></span>
            <span class="navbar-toggler-bar navbar-kebab"></span>
          </button>
          <div class="collapse navbar-collapse" id="navigation">
            <ul class="navbar-nav ml-auto">
              <li class="search-bar input-group">
                <button class="btn btn-link" id="search-button" data-toggle="modal" data-target="#searchModal" "><i class="tim-icons icon-zoom-split" ></i>
                  <span class="d-lg-none d-md-block">Search for Inquiries</span>
                </button>
              </li>
              <li class="dropdown nav-item">
                <a href="javascript:void(0)" class="dropdown-toggle nav-link" data-toggle="dropdown">
                  <div class="notification d-none d-lg-block d-xl-block"></div>
                  <i class="tim-icons icon-sound-wave"></i>
                  <p class="d-lg-none">
                    Notifications
                  </p>
                </a>
                <ul class="dropdown-menu dropdown-menu-right dropdown-navbar">
                  <li class="nav-link"><a href="#" class="nav-item dropdown-item">Mike John responded to your email</a></li>
                  <li class="nav-link"><a href="javascript:void(0)" class="nav-item dropdown-item">You have 5 more tasks</a></li>
                  <li class="nav-link"><a href="javascript:void(0)" class="nav-item dropdown-item">Your friend Michael is in town</a></li>
                  <li class="nav-link"><a href="javascript:void(0)" class="nav-item dropdown-item">Another notification</a></li>
                  <li class="nav-link"><a href="javascript:void(0)" class="nav-item dropdown-item">Another one</a></li>
                </ul>
              </li>
              <li class="dropdown nav-item">
                <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown">
                  <div class="photo">
                    <img src="../assets/img/anime3.png" alt="Profile Photo">
                  </div>
                  <b class="caret d-none d-lg-block d-xl-block"></b>
                  <p class="d-lg-none">
                    Log out
                  </p>
                </a>
                <ul class="dropdown-menu dropdown-navbar">
                  <li class="nav-link"><a href="javascript:void(0)" class="nav-item dropdown-item">Profile</a></li>
                  <li class="nav-link"><a href="javascript:void(0)" class="nav-item dropdown-item">Settings</a></li>
                  <li class="dropdown-divider"></li>
                  <li class="nav-link"><a href="javascript:void(0)" class="nav-item dropdown-item">Log out</a></li>
                </ul>
              </li>
              <li class="separator d-lg-none"></li>
            </ul>
          </div>
        </div>
      </nav>
      <div class="modal modal-search fade" id="searchModal" tabindex="-1" role="dialog" aria-labelledby="searchModal" aria-hidden="true">
        <div class="modal-dialog" role="document">
          <div class="modal-content">
            <div class="modal-header">
              <input type="text" class="form-control" id="inlineFormInputGroup" placeholder="SEARCH FOR INQUERIES">
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <i class="tim-icons icon-simple-remove"></i>
              </button>
            </div>
          </div>
        </div>
      </div>

      <!--Content-->
      <div class="content" id="contentStat">

      <div class="bigcon">
        <div class="content">
          <div class="row">
            <div class="col-md-8">
              <div class="card">
                <div class="card-header">
                  <h5 class="title">Edit Profile</h5>
                </div>
                <div class="card-body" id="formDetails" >
                  <form action="updateEvent/${event.ename }">
                    <div class="row">
                      <div class="col-md-5 pr-md-1">
                        <div class="form-group">
                          <label>Event Code</label>
                          <input type="text" class="form-control" disabled="" placeholder="" name=id value=${event.id} readonly>
                        </div>
                      </div>
                      <div class="col-md-3 px-md-1">
                        <div class="form-group">
                          <label>Event Name</label>
                          <input type="text" class="form-control" disabled="" value=${event.ename}  name=ename readonly>
                        </div>
                      </div>
                      <div class="col-md-4 pl-md-1">
                        <div class="form-group">
                          <label for="exampleInputEmail1">Date</label>
                          <input type="text" class="form-control" disabled="" value=${event.edate} name=edate>
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-6 pr-md-1">
                        <div class="form-group">
                          <label>Event Type</label>
                          <input type="text" class="form-control" disabled="" value=${event.etype}  name=etype readonly>
                        </div>
                      </div>
                      <div class="col-md-6 pl-md-1">
                        <div class="form-group">
                          <label>Start Time</label>
                          <input type="text" class="form-control" disabled="" value=${event.etime} name=etime>
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-12">
                        <div class="form-group">
                          <label>Venue</label>
                          <input type="text" class="form-control" disabled="" value=${event.elocation} name=elocation>
                        </div>
                      </div>
                    </div>
  
                    <div class="row">
                      <div class="col-md-6 pr-md-1">
                        <div class="form-group">
                          <label>Company</label>
                          <input type="text" class="form-control" disabled="" placeholder="IBack"  name=eCompany readonly>
                        </div>
                      </div>
                      <div class="col-md-6 pl-md-1">
                        <div class="form-group">
                          <label>Contact No</label>
                          <input type="text" class="form-control" disabled="" value=${event.ephoneNo} name=ephoneNo>
                        </div>
                      </div>
                    </div>
  
                    <div class="row">
  
                     <B> <h3 class="card-title" style="color: violet; ">  &nbsp Total Price : Rs. &nbsp </h3></B><h3 class="card-title" id="price"> 100.00</h3>
                    
                    </div>
                   
                  
                </div>
                <div class="card-footer">
                  <button type="submit" class="btn btn-fill btn-primary" id="save" hidden="true">Update Details</a></button></form>
                  <button type="submit" class="btn btn-fill btn-danger" onclick="toggleStatusDisable()" id="cancel" hidden="true"><a href="/confirmEvent/${event.ename}">Confirm Event</a></button></form>
                  <button type="submit" class="btn btn-fill btn-danger" onclick="toggleStatusDisable()" id="cancel1" hidden="true"><a href = "/deleteEvent/${event.ename}">Delete Event</a></button></form>
                  <button type="submit" class="btn btn-fill btn-primary" onclick="toggleStatusEnable()" id="update" >Enable for Update</button></form>
                </div>
              </div>
            </div>
            
            <div class="col-md-4">
              <div class="profcard">
              <div class="card card-user">
                <div class="card-body">
                  <p class="card-text">
                    <div class="author">
                      <div class="block block-one"></div>
                      <div class="block block-two"></div>
                      <div class="block block-three"></div>
                      <div class="block block-four"></div>
                      <a href="javascript:void(0)">
                        <img class="avatar" src="../assets/img/emilyz.jpg" alt="...">
                        
                        <h5 class="title" name="namedesc">Mike Andrew</h5>
                      </a>
                      <p class="description" name="positionDesc">
                        Position
                      </p>
                      <p class="description" name="companyDesc">
                        Company
                      </p>
                      <p class="description" name="EmailDesc">
                        Email
                      </p>
                      
                    </div>
                  </p>
                  
              </div>
            </div>
          </div>
        </div>
  
  
        </div>
       
  
        <div class="content">
  
            <!--stats-->
               <!--Stats
            <div class="content">
                <div class="row">
                  <div class="col-lg-3 col-md-6 col-sm-6">
                    <div class="card card-stats">
                      <div class="card-body ">
                        <div class="row">
                          <div class="col-5 col-md-4">
                            <div class="icon-big text-center icon-warning">
                              <i class="nc-icon nc-globe text-warning"></i>
                            </div>
                          </div>
                          <div class="col-7 col-md-8">
                            <div class="numbers">
                              <p class="card-category">Completed Events</p>
                              <p class="card-title">150
                                <p>
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="card-footer ">
                        <hr>
                        <div class="stats">
                          <i class="fa fa-refresh"></i> Refresh For Updates
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="col-lg-3 col-md-6 col-sm-6">
                    <div class="card card-stats">
                      <div class="card-body ">
                        <div class="row">
                          <div class="col-5 col-md-4">
                            <div class="icon-big text-center icon-warning">
                              <i class="nc-icon nc-money-coins text-success"></i>
                            </div>
                          </div>
                          <div class="col-7 col-md-8">
                            <div class="numbers">
                              <p class="card-category">Approved Events</p>
                              <p class="card-title">1,345
                                <p>
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="card-footer ">
                        <hr>
                        <div class="stats">
                          <i class="fa fa-calendar-o"></i> <a href="" class="alink">Show Details</a>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="col-lg-3 col-md-6 col-sm-6">
                    <div class="card card-stats">
                      <div class="card-body ">
                        <div class="row">
                          <div class="col-5 col-md-4">
                            <div class="icon-big text-center icon-warning">
                              <i class="nc-icon nc-vector text-danger"></i>
                            </div>
                          </div>
                          <div class="col-7 col-md-8">
                            <div class="numbers">
                              <p class="card-category">Events with Payment Dues</p>
                              <p class="card-title">23
                                <p>
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="card-footer ">
                        <hr>
                        <div class="stats">
                          <i class="fa fa-clock-o"></i> <a href="" class="alink">Show Details</a>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="col-lg-3 col-md-6 col-sm-6">
                    <div class="card card-stats">
                      <div class="card-body ">
                        <div class="row">
                          <div class="col-5 col-md-4">
                            <div class="icon-big text-center icon-warning">
                              <i class="nc-icon nc-favourite-28 text-primary"></i>
                            </div>
                          </div>
                          <div class="col-7 col-md-8">
                            <div class="numbers">
                              <p class="card-category">Pending Events</p>
                              <p class="card-title">45
                                <p>
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="card-footer ">
                        <hr>
                        <div class="stats">
                          <i class="fa fa-refresh"></i> <a href="" class="alink">Show Details</a>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              -->
    
          </div>
  
          <!--table-->
        <div class="content">
  
            <div class="content">
                <div class="row">
                  <div class="col-md-12">
                    <div class="card ">
                      <div class="card-header">
                        <h4 class="card-title">Inquiries</h4>
                      </div>
                      <div class="card-body">
                        <div class="table-responsive">
                          <table class="table tablesorter " id="">
                            <thead class=" text-primary">
                            
                            </thead>
                            <tbody>
                              <tr>
                               
                                <td>
                                  <div class="alert alert-info alert-with-icon" data-notify="container" style="background-color: coral" id="notificationBack">
                                    <button type="button" aria-hidden="true" class="close" data-dismiss="alert" aria-label="Close" onclick="changeColor()">
                                      <i class="tim-icons icon-simple-remove"></i>
                                    </button>
                                    <span data-notify="icon" class="tim-icons icon-bell-55"></span><span data-notify="message" id="notificationDate" style="font-weight:bold">Date and Time</span>
                                    <span data-notify="message" id="notificationDetails">This is a notification with close button and icon and have many lines. You can see that the icon and the close button are always vertically aligned. This is a beautiful notification. So you don't have to worry about the style.</span>
                                  </div>
                                </td>
                                
                              </tr>
                              
                              
                              
                            </tbody>
                          </table>
                        </div>
                      </div>
                    </div>
                  </div>
  
  
        </div>
  
                      <!--End of Event Table-->
      </div></div></div></div></div></div></div>




    
    </div>
  </div>
  
 
  <!--   Core JS Files   -->
  <script src="../assets/js/core/jquery.min.js"></script>
  <script src="../assets/js/core/popper.min.js"></script>
  <script src="../assets/js/core/bootstrap.min.js"></script>
  <script src="../assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
  <!--  Google Maps Plugin    -->
  <!-- Place this tag in your head or just before your close body tag. -->
  <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
  <!-- Chart JS -->
  <script src="../assets/js/plugins/chartjs.min.js"></script>
  <!--  Notifications Plugin    -->
  <script src="../assets/js/plugins/bootstrap-notify.js"></script>
  <!-- Control Center for Black Dashboard: parallax effects, scripts for the example pages etc -->
  <script src="../assets/js/black-dashboard.min.js?v=1.0.0"></script><!-- Black Dashboard DEMO methods, don't include it in your project! -->
  <script src="../assets/demo/demo.js"></script>
  <script>
    $(document).ready(function() {
      $().ready(function() {
        $sidebar = $('.sidebar');
        $navbar = $('.navbar');
        $main_panel = $('.main-panel');

        $full_page = $('.full-page');
        

        $sidebar_responsive = $('body > .navbar-collapse');
        sidebar_mini_active = true;
        white_color = false;

        window_width = $(window).width();

        fixed_plugin_open = $('.sidebar .sidebar-wrapper .nav li.active a p').html();



        $('.fixed-plugin a').click(function(event) {
          if ($(this).hasClass('switch-trigger')) {
            if (event.stopPropagation) {
              event.stopPropagation();
            } else if (window.event) {
              window.event.cancelBubble = true;
            }
          }
        });

        $('.fixed-plugin .background-color span').click(function() {
          $(this).siblings().removeClass('active');
          $(this).addClass('active');

          var new_color = $(this).data('color');

          if ($sidebar.length != 0) {
            $sidebar.attr('data', new_color);
          }

          if ($main_panel.length != 0) {
            $main_panel.attr('data', new_color);
          }

          if ($full_page.length != 0) {
            $full_page.attr('filter-color', new_color);
          }

          if ($sidebar_responsive.length != 0) {
            $sidebar_responsive.attr('data', new_color);
          }
        });

        $('.switch-sidebar-mini input').on("switchChange.bootstrapSwitch", function() {
          var $btn = $(this);

          if (sidebar_mini_active == true) {
            $('body').removeClass('sidebar-mini');
            sidebar_mini_active = false;
            blackDashboard.showSidebarMessage('Sidebar mini deactivated...');
          } else {
            $('body').addClass('sidebar-mini');
            sidebar_mini_active = true;
            
            blackDashboard.showSidebarMessage('Sidebar mini activated...');
          }

          // we simulate the window Resize so the charts will get updated in realtime.
          var simulateWindowResize = setInterval(function() {
            window.dispatchEvent(new Event('resize'));
          }, 180);

          // we stop the simulation of Window Resize after the animations are completed
          setTimeout(function() {
            clearInterval(simulateWindowResize);
          }, 1000);
        });

        $('.switch-change-color input').on("switchChange.bootstrapSwitch", function() {
          var $btn = $(this);

          if (white_color == true) {

            $('body').addClass('change-background');
            setTimeout(function() {
              $('body').removeClass('change-background');
              $('body').removeClass('white-content');
            }, 900);
            white_color = false;
          } else {

            $('body').addClass('change-background');
            setTimeout(function() {
              $('body').removeClass('change-background');
              $('body').addClass('white-content');
            }, 900);

            white_color = true;
          }


        });

        $('.light-badge').click(function() {
          $('body').addClass('white-content');
        });

        $('.dark-badge').click(function() {
          $('body').removeClass('white-content');
        });
      });
    });
  </script>
  <script>
    $(document).ready(function() {
      // Javascript method's body can be found in assets/js/demos.js
      demo.initDashboardPageCharts();

    });
  </script>
  <script src="https://cdn.trackjs.com/agent/v3/latest/t.js"></script>
  <script>
    window.TrackJS &&
      TrackJS.install({
        token: "ee6fab19c5a04ac1a32a645abde4613a",
        application: "black-dashboard-free"
      });
  </script>



<script>
 

function toggleStatusDisable() {
    
        $('#formDetails :input').attr('disabled', true);
        $('#cancel').attr('hidden', true);
        $('#cancel1').attr('hidden', true);
        $('#save').attr('hidden', true);
        $('#update').attr('hidden', false);
        location.reload();
    
}
  
function toggleStatusEnable() {
    
    $('#formDetails :input').attr('disabled', false);
    $('#update').attr('hidden', true);
    $('#cancel').attr('hidden', false);
    $('#cancel1').attr('hidden', false);
    $('#save').attr('hidden', false);
    
    
    
}
</script>



</body>


</html>