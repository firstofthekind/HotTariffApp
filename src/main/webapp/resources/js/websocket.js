/*$(document).ready(function() {
    const socket = new SockJS('/schedule');
    const stompClient = Stomp.over(socket);

    stompClient.connect({ }, function() {
        stompClient.subscribe("/message", function() { // subscribe to the /schedule/message endpoint
            window.location.reload();
        });
    });
});*/

function mode() {
    $.ajax({
        url: '/HotTariffApp/index',
        success: function(data) {
            $('#tarifflist').html(data);
        }
    });
};

setInterval(mode, 30000);
