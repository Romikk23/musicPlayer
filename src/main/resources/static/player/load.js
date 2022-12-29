var listAudio;

function createTrackItem(index,name,img){
    var path = window.location.pathname;
    var page = path.substring(path.indexOf("/")+1,path.lastIndexOf("/"));
    var id = path.slice(-1);
    var boxItem = document.createElement('div');
    boxItem.setAttribute("class", "box");
    boxItem.setAttribute("id", "box-"+index);
    document.querySelector(".playlist-ctn").appendChild(boxItem);

    var trackItem = document.createElement('div');
    trackItem.setAttribute("class", "playlist-track-ctn");
    trackItem.setAttribute("id", "ptc-"+index);
    trackItem.setAttribute("data-index", index);
    document.querySelector("#box-"+index).appendChild(trackItem);

    console.log(img);
    console.log(name);

    var iconItem = document.createElement('img');
    iconItem.setAttribute("class", "preview-image");
    iconItem.setAttribute("src", img);
    iconItem.setAttribute("id", "icn-"+index);
    document.querySelector("#ptc-"+index).appendChild(iconItem);


    var playBtnItem = document.createElement('div');
    playBtnItem.setAttribute("class", "playlist-btn-play");
    playBtnItem.setAttribute("id", "pbp-"+index);
    document.querySelector("#ptc-"+index).appendChild(playBtnItem);

    var btnImg = document.createElement('i');
    btnImg.setAttribute("class", "fas fa-play");
    btnImg.setAttribute("height", "40");
    btnImg.setAttribute("width", "40");
    btnImg.setAttribute("id", "p-img-"+index);
    document.querySelector("#pbp-"+index).appendChild(btnImg);

    var trackInfoItem = document.createElement('div');
    trackInfoItem.setAttribute("class", "playlist-info-track");
    trackInfoItem.innerHTML = name
    document.querySelector("#ptc-"+index).appendChild(trackInfoItem);

    if(page == "rek") {
        var trackAdd = document.createElement('a');
        trackAdd.setAttribute("href", "/delete/" + (index + 1) + "/user/" + id);
        trackAdd.innerHTML = "⊗"
        document.querySelector("#ptc-" + index).appendChild(trackAdd);
    }

    if(page == "index") {
        var trackAdd = document.createElement('a');
        trackAdd.setAttribute("href", "/add/" + (index + 1) + "/user/" + id);
        trackAdd.innerHTML = "♥"
        document.querySelector("#ptc-" + index).appendChild(trackAdd);
    }

}

function createTrackList(songs){

    for (var i = 0; i < songs.length; i++) {
        createTrackItem(i,songs[i].name,songs[i].image);
    }
}