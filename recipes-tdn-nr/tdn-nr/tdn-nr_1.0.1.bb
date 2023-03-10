SUMMARY = "TDN USB Printer Extras"
DESCRIPTION = "printer.c"
HOMEPAGE = ""
LICENSE = "CLOSED"
MY_FILES = "${THISDIR}/nr-files"

SRC_URI += "https://github.com/Switchpoint-Online/meta-extras.git;protocol=ssh;branch=kirkstone"
SRC_URI[sha256sum] = "3d51ac2e408ea9b20c577e366d1b62e11080006ed2209eb10308c1e72922ea14"

do_install() {
    install -d ${D}/home/root
    mkdir ${D}/home/root/.node-red
    cp -R ${MY_FILES}/* ${D}/home/root/.node-red
}

FILES:${PN}= "/home/root/.node-red"
