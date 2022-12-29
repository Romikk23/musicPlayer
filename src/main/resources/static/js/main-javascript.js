var isVisible = false
function myFunction() {
    var popup = document.getElementById("myPopup");
    var blur = document.getElementById("myBlur");
    var id = window.location.pathname.slice(-1);
    console.log(window.location.pathname);
    console.log(id);
    document.getElementById("name").value = "";
    document.getElementById("pass").value = "";
    if(id == "0" || id == "/") {
        if (isVisible == true) {
            popup.style.visibility = "hidden";
            blur.style.visibility = "hidden";
            isVisible = false;
        } else {
            popup.style.visibility = "visible";
            blur.style.visibility = "visible";
            isVisible = true;
        }
    }
}