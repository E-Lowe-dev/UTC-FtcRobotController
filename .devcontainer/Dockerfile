FROM mcr.microsoft.com/devcontainers/base:ubuntu

ENV ANDROID_HOME=/opt/android-sdk
ENV ANDROID_SDK_ROOT=/opt/android-sdk
ENV PATH=$PATH:$ANDROID_HOME/cmdline-tools/latest/bin:$ANDROID_HOME/platform-tools

RUN apt-get update -yqq && \
    apt-get install -y wget unzip curl openjdk-17-jdk python3 && \
    apt-get clean

RUN wget -q https://dl.google.com/android/repository/commandlinetools-linux-11076708_latest.zip -O /tmp/cmdtools.zip && \
    mkdir -p $ANDROID_HOME/cmdline-tools/latest && \
    unzip -q /tmp/cmdtools.zip -d /tmp/cmdtools && \
    mv /tmp/cmdtools/cmdline-tools/* $ANDROID_HOME/cmdline-tools/latest/ && \
    rm -rf /tmp/cmdtools.zip /tmp/cmdtools

RUN yes | sdkmanager --licenses && \
    sdkmanager "platforms;android-34" "build-tools;34.0.0"
