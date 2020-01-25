#!/usr/bin/env groovy
def info(message) {
    echo "INFO: ${message}"
    return this
}

def warning(message) {
    echo "WARNING: ${message}"
    return this
}
