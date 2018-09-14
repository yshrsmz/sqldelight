# A custom container image for building SDK Search
#
# Build locally:
#   docker build .circleci/image
#
# Test locally:
#   docker run -it <hash> /bin/bash
#
# Tag:
#   docker build -t jakewharton/sqldelight:<version> .circleci/image
#
# Release:
#   docker push jakewharton/sqldelight:<version>

FROM circleci/android:api-28-alpha

# Disable assistive technologies in the headless JDK (from https://askubuntu.com/a/723503/2459).
RUN sudo sed -i -e '/^assistive_technologies=/s/^/#/' /etc/java-*-openjdk/accessibility.properties

# Install an ARM emulator for API 18 into the SDK and create an instance of it.
RUN sdkmanager "system-images;android-18;default;armeabi-v7a"
RUN echo "no" | avdmanager create avd --force -n test -k "system-images;android-18;default;armeabi-v7a"
