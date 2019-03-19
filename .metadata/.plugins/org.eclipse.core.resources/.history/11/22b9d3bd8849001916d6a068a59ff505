
document.getElementById("sexem").checked = true;
function validerLeformulaire() {
	


    let nomElement = document.getElementById("nom");
    let nom = nomElement.value;
    if(nom === ""){
        nomElement.classList.add("erreur");
    }else{
        nomElement.classList.remove("erreur");
    }

    // check prenom
    let prenomBlock =
        document.getElementById("prenom");
    let prenom = prenomBlock.value

    if(prenom === ""){
        prenomBlock.classList.add("erreur");
    }else{
        prenomBlock.classList.remove("erreur");
    }

   

    let gradeb =
        document.getElementById("grade");
    let grade = gradeb.value

    if(grade === ""){
        gradeb.classList.add("erreur");
    }else{
        gradeb.classList.remove("erreur");
    }
    
    
    let numeroBlock =
        document.getElementById("numero");
    let numero = numeroBlock.value

    if(numero === ""){
        numeroBlock.classList.add("erreur");
    }else{
        numeroBlock.classList.remove("erreur");
    }
    
    
 
  
   
    let dateBlock =
        document.getElementById("dateembauche");
    let dateembauche = dateBlock.value

    if(dateembauche === ""){
        dateBlock.classList.add("erreur");
    }else{
        dateBlock.classList.remove("erreur");
       
    }
    
    
    
    
    let datenaissanceBlock =
        document.getElementById("datenaissance");
    let datenaissance = datenaissanceBlock.value

    if(datenaissance === ""){
    	datenaissanceBlock.classList.add("erreur");
    }else{
    	datenaissanceBlock.classList.remove("erreur");
       
    }
    
    
    let PhotoBlock =
        document.getElementById("photo");
    let photo = PhotoBlock.value

    if(photo === ""){
    	PhotoBlock.classList.add("erreur");
    }else{
    	PhotoBlock.classList.remove("erreur");
       
    }   
    
    let classerreur = document.getElementsByClassName("erreur");
    console.log(classerreur);
    console.log("taille du tableau" + classerreur.length);
    
    if(classerreur.length === 0){
    	
    	console.log("envoyer le formulaire");
    	document.getElementById("formulaire")
    }
    
    document.getElementById("formulaire").submit(); 
    
}