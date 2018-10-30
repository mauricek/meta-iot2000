SUMMARY = "Qt SensorTag demo"
DESCRIPTION = "Qt SensorTag demo highlighting Bluetooth LE and MQTT"

LICENSE = "BSD"
HOMEPAGE = "http://code.qt.io/cgit/qt-apps/boot2qt-demos.git"
LIC_FILES_CHKSUM = "file://main.cpp;endline=49;md5=0af8e668109fd71c5225ea61e0b1c368"

DEPENDS = "qtdeclarative qtgraphicaleffects qtcharts qtconnectivity qtmqtt"

SRCREV = "80dc774b966adf069e84d9777b27886f357a1bb5"
QT_GIT_PROJECT = "qt-apps"
SRC_URI = "git://code.qt.io/qt-apps/boot2qt-demos.git;branch=5.12"

S = "${WORKDIR}/git/tradeshow/iot-sensortag"

require recipes-qt/qt5/qt5.inc

do_install() {
    install -d ${D}${sbindir}
    install -m 0755 ${B}/SensorTagDemo ${D}${sbindir}
}

FILES_${PN} += " \
        ${sbindir}/SensorTagDemo \
"

