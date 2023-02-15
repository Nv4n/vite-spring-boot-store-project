# Declare the base image
FROM node:19-alpine
WORKDIR /app

# Build step
COPY package*.json .

# Install dependencies
RUN npm i

# Copy the source code to WORKDIR dir
COPY . .

# Expose port on the container
EXPOSE 5173

# run the app
CMD ["npm", "run", "dev"]