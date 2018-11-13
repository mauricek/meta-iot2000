SUMMARY = "Qt Mqtt SensorTag headless"
DESCRIPTION = "This package contains the headless sensortag demo"
HOMEPAGE = "http://qt.io"
LICENSE = "CC-BY-3.0"
LIC_FILES_CHKSUM = "file://README.txt;md5=e4720231aea69dfe32f78ac423cdf4dc"

DEPENDS = "qtbase qtmqtt qtconnectivity"

SRCREV = "d5b7b760ddabad0faa9c2631514ecce06be0c9bf"

SRC_URI = "git://git@git.qt.io/makalino/sps_snippets.git;protocol=ssh;branch=yocto"

S = "${WORKDIR}/git"

require recipes-qt/qt5/qt5.inc
TARGET_CFLAGS += " -DDEBUG"
do_install() {
    install -d ${D}${datadir}/${P}
    install -m 0755 ${B}/logplayer/sensorconsole ${D}${datadir}/${P}
}

FILES_${PN}-dbg += "${datadir}/${P}/.debug"
FILES_${PN} += "${datadir}"
