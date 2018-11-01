SUMMARY = "Qt SensorTag demo"
DESCRIPTION = "Qt SensorTag demo highlighting Bluetooth LE and MQTT"


LICENSE = "BSD"
HOMEPAGE = "http://code.qt.io/cgit/qt-apps/boot2qt-demos.git"
LIC_FILES_CHKSUM = "file://main.cpp;endline=49;md5=0af8e668109fd71c5225ea61e0b1c368"

require recipes-qt/qt5/qt5.inc

DEPENDS += "qtdeclarative qtgraphicaleffects qtcharts qtconnectivity qtmqtt qtquickcontrols qtquickcontrols2"
PACKAGECONFIG ?= "qtquickcompiler"

SRCREV = "3f1e26264634057147dd77fbf427c1777b86ba29"
QT_GIT_PROJECT = "qt-apps"
SRC_URI = "git://code.qt.io/qt-apps/boot2qt-demos.git;branch=5.12"

S = "${WORKDIR}/git/tradeshow/iot-sensortag"


do_install() {
    install -d ${D}${sbindir}
    install -m 0755 ${B}/SensorTagDemo ${D}${sbindir}
}

FILES_${PN} += " \
        ${sbindir}/SensorTagDemo \
"

