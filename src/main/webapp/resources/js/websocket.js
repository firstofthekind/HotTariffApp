function mode() {
    $.ajax({
        url: '/HotTariffApp/index',
        success: function(data) {
            $('#tarifflist').html(data);
        }
    });
}
 setInterval(mode, 100);
