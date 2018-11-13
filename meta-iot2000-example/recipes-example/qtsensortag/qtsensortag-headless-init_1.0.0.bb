SUMMARY = "Get sensortag autostarted"
LICENSE = "CLOSED"

SRC_URI="file://sensortag \
         file://broker.json"

RDEPENDS_${PN} += "qtsensortag-headless"

# Copy the broker.json configuration to the files directory.
# Otherwise building an image will fail!!
FILES_${PN} += "${datadir}/qtsensortag-headless-1.0.0/broker.json"

do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -d ${D}${sysconfdir}/rc5.d

    install -m 0755 ${WORKDIR}/sensortag ${D}${sysconfdir}/init.d/
    ln -sf ../init.d/sensortag ${D}${sysconfdir}/rc5.d/S80sensortag

    install -d ${D}${datadir}/qtsensortag-headless-1.0.0
    install -m 0755 ${WORKDIR}/broker.json ${D}${datadir}/qtsensortag-headless-1.0.0/
}

