
<!DOCTYPE html>
<html lang="fr">
    
    <head>
        <meta charset="UTF-8" />
        <title>Ramassage</title>
       
    </head>

    <body>
<div class="dropdown">   
    <button class="dropdown-btn">
        <span>Modjo</span>   
    </button>
             
    <div class="dropdown-menu">
        <ul class="profile-menu">
            
            <a href="#"><li>Resumer</li></a>
            <a href="#"><li>Modifier son Profil</li></a>
          <a href="#">  <li>reclamer son argent</li></a>
           <a href="#"> <li>Mes Voyage</li></a>
           <a href="#"> <li>Message</li></a>
          <a href="#">  <li>Voyage Propose</li></a>
         <a href="#">   <li>Payement</li></a>
            <a href="#"><li>Se deconnecter</li></a>

        </ul>
        
    </div>
    
</div>
        
<style>
.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-menu {
    display: none;
    position: absolute;
    background-color: greenyellow;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    padding: 12px 16px;
    z-index: 1;
}

.dropdown:hover .dropdown-menu {
    display: block;
}
    
    .dropdown-btn {
    background-color: #4CAF50;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
}
    
    .dropdown-menu a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    color: red;
}
    
    .dropdown-menu a:hover {background-color: #f1f1f1}
    
    .dropdown:hover .dropdown-btn {
    background-color: #3e8e41;
}
    
        .profile-menu li {
  list-style: none;
}
</style>  
        
    </body>
    
    
</html>