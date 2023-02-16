# Declare the base image
FROM node:19-alpine
WORKDIR /app/frontend/

# Build step
COPY package*.json .

# Install dependencies
RUN npm ci

# Copy the source code to WORKDIR dir
COPY . .

# Expose port on the container
EXPOSE 3000

# run the app
CMD ["npm", "run", "dev"]