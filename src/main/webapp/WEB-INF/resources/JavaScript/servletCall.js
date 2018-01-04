function callToSerletForRdpFile(){
var xmlhttprequestClientForSession =null;
xmlhttprequestClientForSession = new XMLHttpRequest();
xmlhttprequestClientForSession.open("GET",window.location.origin+"/vdipro/DownLoadUserRdpProfile"+document.location.search,true);
xmlhttprequestClientForSession.send(null);
}