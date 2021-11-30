$(document).ready(function() {
        var socket = new SockJS('/HotTariffApp/hot');
        stompClient = Stomp.over(socket);
        stompClient.connect({}, function (frame) {
            console.log('Connected: ' + frame);
            stompClient.subscribe('/message', function () {
                    $.ajax({
                        url: '/HotTariffApp/index',
                        success: function() {
                            $("#tarifflist").load(location.href + " #tarifflist");
                        }
                    });

            });
        });
});