DESCRIPTION = "OpenBMC mtd-util"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=b77c43ae4eaf67bd73fb6452b2f113a3"

SRC_URI = "git://github.com/Intel-BMC/mtd-util;protocol=ssh"

PV = "1.0+git${SRCPV}"
SRCREV = "679c6bddaa1fc4fdd473eb84d4e9f97f78ab0f12"


S = "${WORKDIR}/git"

DEPENDS += "dbus openssl zlib boost microsoft-gsl"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

